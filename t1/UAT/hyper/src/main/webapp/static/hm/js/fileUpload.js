//重载vvalidate一个函数
$(function(){
	$.validator.addMethod("accept", function(value, element, param) {
		return true;
	}, $.validator.format(""));
});
var isResultType = function(type,index) {
	var imgTypeArr = ["png","jpg","jpeg","gif","*"];
	var otherTypeArr = ["pdf"];
    var array = [];  //可以上传的文件类型
    var msg;
    var fileName = $("#file_"+index).val();

    if(type=="image"){
    	array = imgTypeArr;
    	msg = ["让选择要上传的图片","上传图片类型不正确"];
	}else if(type=="application"){
		array = otherTypeArr;
    	msg = ["让选择要上传的PDF文件","上传文件类型不正确"];
	}
    
    if (fileName == '') {
    	errorMsg(index, msg[0]);
        return false;
    }
    else {
    	var index1=fileName.lastIndexOf(".")+1;  
    	var index2=fileName.length;
    	var fileContentType=fileName.substring(index1,index2);//后缀名  
        var isExists = false;
        for (var i in array) {
            if (fileContentType.toLowerCase() == array[i].toLowerCase()) {
                isExists = true;
                return true;
            }
        }
        if (isExists == false) {
            fileName = null;
            errorMsg(index, msg[1]);
            return false;
        }
        return false;
    }
};
var saveFile = function(index) {
	var appid = $("#appid_" + index).val();
	var attid = $("#attid_" + index).val();
	var file = $("#file_" + index).get(0).files[0];
	if (!file) {
		return;
	}
	var accept = $("#file_"+index).attr("accept");
	
	var type = accept.split("/")[0];
	
	if(!isResultType(type,index)){
		return;
	}
	
	var url = "attach/genOssPolicy";
	var params = {
		appId : appid,
		attId : attid
	};
	Metronic.blockUI({
		target : "#uploadFile_" + index
	});
	$.ajax({
		type : "GET",
		url : url,
		data : params,
		success : function(data) {
			if(isLogin(data)){				
				if (data.success == true) {
					uploadFile(index, appid, attid, file, data.data);
				} else {
					errorMsg(index, data.message);
				}
			}
		},
		error : function(request) {
			errorMsg(index, "操作失败");
		}
	});
};
var uploadFile = function(index, appid, attid, file, data) {
	var fileName = file.name;
	var index1=fileName.lastIndexOf(".")+1;  
	var index2=fileName.length;
	var fileType=fileName.substring(index1,index2);//后缀名  
	var dataResult = eval("(" + data + ")");
	var host = dataResult['host'];
	var ossid = dataResult['key'];
	var key = dataResult['dir'] + ossid;
	var fd = new FormData();
	fd.append('key', key);
	fd.append('Content-Type', file.type);
	fd.append('OSSAccessKeyId', dataResult['accessid']);
	fd.append('policy', dataResult['policy']);
	fd.append('signature', dataResult['signature']);
	fd.append('file', file);
	fd.append('name', file.name);
	fd.append('success_action_status', '200');
	$.ajax({
		type : "POST",
		contentType : false,
		processData : false,
		data : fd,
		cache : false,
		url : host,
		success : function(data, status, xhr) {
			if (xhr.status == "200") {
				updateAttach(index, appid, attid, ossid, fileType);
			} else {
				errorMsg(index, "操作失败");
			}
		},
		error : function(data, status, e) {
			errorMsg(index, "操作失败");
		}
	});
};
var updateAttach = function(index, appid, attid, ossid, fileType) {
	var url = "attach/save";
	var id = $("#id_" + index).val();
	var option = $("#option_" + index).val();
	var params = {
		id : id,
		appId : appid,
		attId : attid,
		ossId : ossid,
		fileType : fileType,
		option : option
	};
	$.ajax({
		type : "POST",
		url : url,
		data : params,
		success : function(data) {
			Metronic.unblockUI("#uploadFile_" + index);
			if(isLogin(data)){				
				if (data.success && data.data) {
					$("#id_" + index).val(data.data.id);
					$("#time_" + index).html(data.data.time);
					$("#url_" + index).val(data.data.url);
					$("#ossid_" + index).val(data.data.ossId);
					$("#uploadFile_" + index).find(".fileinput-filename").text($("#file_" + index).get(0).files[0].name);
					showBtn(index);
					rebuildFileInput(index);
				} else {
					errorMsg(index, data.message);
				}
			}
		},
		error : function(request) {
			errorMsg(index, "操作失败");
		}
	});
};
var showBtn = function(index){
	$("#uploadFile_" + index).find(".btn-up").removeClass("fileinput-new").addClass("fileinput-exists");
	$("#uploadFile_" + index).find(".btn-change").removeClass("fileinput-exists").addClass("fileinput-new");
	$("#uploadFile_" + index).find(".btn-del").removeClass("fileinput-exists").addClass("fileinput-new");
	$("#uploadFile_" + index).find(".btn-show").removeClass("fileinput-exists").addClass("fileinput-new");
};
var hideBtn = function(index){
	$("#uploadFile_" + index).find(".btn-up").removeClass("fileinput-exists").addClass("fileinput-new");
	$("#uploadFile_" + index).find(".btn-change").removeClass("fileinput-new").addClass("fileinput-exists");
	$("#uploadFile_" + index).find(".btn-del").removeClass("fileinput-new").addClass("fileinput-exists");
	$("#uploadFile_" + index).find(".btn-show").removeClass("fileinput-new").addClass("fileinput-exists");
};
var delFile = function(index) {
	var url = "attach/remove";
	var id = $("#id_" + index).val();
	var option = $("#option_" + index).val();
	var params = {
		id : id,
		option : option
	};
	Metronic.blockUI({
		target : "#uploadFile_" + index
	});
	$.ajax({
		type : "POST",
		url : url,
		data : params,
		success : function(data) {
			Metronic.unblockUI("#uploadFile_" + index);
			if(isLogin(data)){				
				if (data.success) {
					$("#id_" + index).val(0);
					$("#time_" + index).html("&nbsp;");
					$("#url_" + index).val("");
					$("#ossid_" + index).val("");
					$("#uploadFile_" + index).find(".fileinput-filename").text("");
					hideBtn(index);
				} else {
					errorMsg(index, data.message);
				}
			}
		},
		error : function(request) {
			errorMsg(index, "操作失败");
		}
	});
};
var showFile = function(index) {
	var type = $("#file_" + index).attr("accept");
	var title = $("#title_" + index).html();
	
	if(type.indexOf("image")<0){
		if(type.indexOf("pdf">=0)){
			var ossId = $("#ossid_" + index).val();
			if(!ossId || ossId.length<=0){
				alert("没有查看的文件");
				return;
			}
			showPDF(ossId);
		}else{
			var url = $("#url_" + index).val();
			if(!url || url.length<=0){
				alert("没有查看的文件");
				return;
			}
			
			window.open(url);
		}
	}else{
		var url = $("#url_" + index).val();
		if(!url || url.length<=0){
			alert("没有查看的文件");
			return;
		}
		
		$("#fileUploadStatic").find(".modal-title").html(title);
		$("#fileUploadStatic").find("img").attr("src", url);
		$("#fileUploadStatic").modal({
			"width" : "50%"
		});
	}
};
var errorMsg = function(index, msg) {
	Metronic.unblockUI("#uploadFile_" + index);
	if (msg) {
		$("#errorMsg").html(msg);
		$("#errorMsg").parent().show();
	}
};
var addFile = function(index){
	//个数限制
	var attid = $("#attid_"+index).val();
	var max = $("#max_"+index).val();
	var typeInputs=$("input[value='"+attid+"']");
	var length=0;
	if(typeInputs){
		length=typeInputs.length;
	}
	if(length>=max){
		return;
	}
	
	var numArr=index.split("_");
	
	var num = numArr[numArr.length-1]*1;
	
	var newIndex = "";
	
	for(var i=0;i<numArr.length-1;i++){
		newIndex += numArr[i] + "_";
	}
	
	newIndex += num+$("#uploadFile_"+index).parent().find(".myfileinput").length;

	var title = $("#title_"+index).text();
	var appid = $("#appid_"+index).val();
	var option = $("#option_"+index).val();
	var accept = $("#file_"+index).attr("accept");
	
	var html = "";
	
	html = '<div class="col-md-12 myfileinput" id="uploadFile_' + newIndex + '">'
	 +			'<div class="row">'
	 +				'<div class="col-md-3 single-row-overflow col-xs-5" style="padding:5px;"><p id="title_' + newIndex + '" class="form-control-static">' + title + '</p></div>'
	 +				'<div class="col-md-2 col-xs-7" style="padding:5px;"><p id="time_' + newIndex + '" class="form-control-static">&nbsp;</p></div>'
	 +				'<div class="col-md-6 col-xs-11" style="padding:5px 0 5px 10px;">'
	 +					'<div class="fileinput-new" data-provides="fileinput">'
	 +						'<div class="input-group">'
	 +							'<div class="form-control uneditable-input" data-trigger="fileinput">'
	 +								'<i class="fa fa-file"></i>&nbsp; <span class="fileinput-filename single-row-overflow" style="width: 150px; height: 20px;"></span>'
	 +							'</div>'
	 +							'<span class="input-group-addon btn default btn-file blue">'
	 +								'<span class="fileinput-new add_button btn-up"><i class="fa fa-upload"></i> 上传 </span>'
	 +								'<span class="fileinput-exists edit_button btn-change"><i class="fa fa-exchange"></i> 更换 </span>'
	 +								'<input type="hidden" id="id_' + newIndex + '" name="attachIds" value="" />'
	 +								'<input type="hidden" id="url_' + newIndex + '" value="" />'
	 +								'<input type="hidden" id="option_' + newIndex + '" value="'+ option +'" />'
	 +								'<input type="hidden" id="appid_' + newIndex + '" value="'+ appid +'" />'
	 +								'<input type="hidden" id="attid_' + newIndex + '" value="'+ attid +'" />'			
	 +								'<input type="hidden" id="ossid_' + newIndex + '" value="" />'			
	 +								'<input type="hidden" id="max_' + newIndex + '" value="'+ max +'" />'			
	 +								'<input type="file" id="file_' + newIndex + '" onchange="saveFile(\'' + newIndex + '\');" accept="'+ accept +'"/>'
	 +							'</span>'
	 +							'<a href="javascript:;" onclick="delFile(\'' + newIndex + '\');" class="input-group-addon btn red fileinput-exists edit_button btn-del" data-dismiss="fileinput"><i class="fa fa-times" style="color: #fff;"></i>移除 </a>'
	 +							'<a href="javascript:;" onclick="showFile(\'' + newIndex + '\');" class="input-group-addon btn green fileinput-exists edit_button btn-show"><i class="fa fa-search" style="color: #fff;"></i>查看 </a>'
	 +						'</div>'
	 +					'</div>'
	 +				'</div>'
	 +				'<div class="col-md-1 col-xs-1" style="padding:14px 5px 5px 5px;">'
	 +					'<a href="javascript:;" onclick="removeFile(\'' + newIndex + '\')" class="btn-file-close"><i class="fa fa-minus-square font-grey-gallery" style="color: #fff;font-size:18px;"></i></a>'
	 +				'</div>'
	 +			'</div>'
	 +		'</div>';
	
	$("#uploadFile_"+index).after(html);
};
var removeFile=function(index){
	delFile(index);
	$("#uploadFile_"+index).remove();
};
var rebuildFileInput=function(index){
	var oldInput=$("#file_"+index);
	var newInput=oldInput.clone(true);
	newInput.insertAfter(oldInput);
	oldInput.remove();
};
/**
 * 
 */

$(function(){
	$('#startTime,#endTime').datepicker({
	    format: 'yyyy-mm-dd',
	    todayBtn : "linked",
	    autoclose : true,
        todayHighlight : true,
        endDate : new Date()
	});
	$('#startTime').datepicker().on('changeDate', function(ev){
   		$('#endTime').datepicker('setStartTime', ev.date);
   	});
   	$('#endTime').datepicker().on('changeDate', function(ev){
   		$('#startTime').datepicker('setEndTime', ev.date);
   	});
   	if($('#isSendWk').val() == "N"){	
   		$("#reSendDiv").removeClass("hide");
   	}else{
   		$("#reSendDiv").addClass("hide");
   	}
   	if($('#appState').val() == "81"){	
   		$("#reSendDelayRefuse").removeClass("hide");
   	}else{
   		$("#reSendDelayRefuse").addClass("hide");
   	}
   	
});

function resetForm(formId){
	$('#'+formId).find('input,select').val('');
}
function subForm(url, form){
	subForm2(url, form);
	
}
	
/**
 * 重发风控和重发万卡共用
 */
function reSend(appId,type){
	$("#reSendType").val(type);
	$("#appId").val(appId);
	$("#mymodal4").modal("show");
}


function reSendSure(){
	$("#mymodal4").modal("hide");
	var reSendType = $("#reSendType").val();
	var appId  = $("#appId").val();
	if('fk'===reSendType){
		go('fkHm/reSendFk?appId='+appId);
	}else{
		//$("#reSendDiv").addClass("hide");
		go('oneCardHm/reSendOneCard');
	}
	
}

function sendDivHide(){
	$("#mymodal4").modal("hide");
}

function toDetail(id){
	var params = $('#searchForm').serialize();
	if(params == '' || params == undefined){
		params = params + "id="+id;
	}else{
		params = params + "&id="+id;
	}
	
	//提交参数字符串转化为参数数组
	params = handleNum(params);
	postGo('appinfo/appHM/detail',params);
}

//返回按钮函数
function reback(req){
	params = handleNum(req);
	postGo('appinfo/appHM/list',params);
}

//提交按钮函数
function submit(id){
	//校验没有选择状态不允许提交
	if(!$('#appStatus').val()){
		$('#appStatus').closest('.form-group').addClass('has-error').find('.help-block.help-block-error').removeClass('hide');
		return;
	}
	
	var params = "id="+id;
	//获取选择下拉框的值
	var option = $("#appStatus option:selected"); 
	var appStatus = option.val();
	if(appStatus == '70'){
		params = handleNum(params);
		postGo('appinfo/appHM/backCancelAppStatus',params);
	}else if(appStatus == '70_Manual'){
		params = handleNum(params);
		postGo('appinfo/appHM/revokeAppStatusManual',params);
	}else{
		params += "&appStatus="+appStatus;
		params = handleNum(params);
		postGo('appinfo/appHM/reSetAppStatus',params);
	}
	
}

//处理参数
function handleNum(params){
	var paramArr = params.split("&");
	for(var i=0; i<paramArr.length; i++){
		var keyValue = paramArr[i].split("=");
		//参数值为空
		if(keyValue[1] == ''){
			//删除元素
			paramArr.splice(i,1);
			//因为删除了一个元素所以这里需要i-1
			i--;
		}
	}
	//如果paramArr为空，则不传任何参数
	//如果paramArr不为空，则将数组用&连接成字符串
	if(paramArr.lenght == 0){
		params = "";
	}else{
		params = paramArr.join("&");
	}
	return params;
}

$(document).on('change',$('#appStatus'),function(){
	if($('#appStatus').val()){
		$('#appStatus').closest('.form-group').removeClass('has-error').find('.help-block.help-block-error').addClass('hide');
	}
});

function showPDF(ossId){
	var server_context="";
	if(publicPath && publicPath!=""){
		server_context=publicPath;
	}else{		
		var localObj = window.location;
		var contextPath = "/"+localObj.pathname.split("/")[1];
		if("/index"==contextPath || "/test"==contextPath){
			contextPath="";
		}
		var basePath = localObj.protocol+"//"+localObj.host+contextPath+"/";
		server_context=basePath;
	}
   // window.open(server_context+"/showpdf/web/viewer.html?pdf="+ossId,"","location=no");
	$.ajax({
		url : 'ossid/getUrl',
		type : "POST",
		cache : false,
		datatype : "json",
		data : {"ossid":ossId},
		async: false,
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {

			if(isLogin(data)){
				$('#ossUrl').val(data);
				window.open("page/viewer","","location=no");
			}
		}
	});
}


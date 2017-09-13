/** 异步提交表单的方法， url 是提交路径 ， from 是表单名称！不填默认为searchForm */
/**
 * 提交表单
 * @param  url 必选，提交地址
 * @param  form 可选，不填默认为searchForm
 * @param  divId 可选，局部刷新div
 */
function subForm(url, form, divId) {
	var formName = "searchForm";
	if (form) {
		formName = form;
	}
	//提交参数
	var params = $('#' + formName).serialize();
	
	if(url.indexOf('pageNo=') < 0){
		if(params == '' || params == undefined)
		{
			params = params + "pageNo=1";
		}else{
			params = params + "&pageNo=1";
		}
	}
	
	//提交参数字符串转化为参数数组
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

	$.ajax({
		type : "POST",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		data : params,
		async : true,
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			if(divId && 'null' != divId && '' != divId){
				$('#'+divId).html(data);// 要刷新的div
			}else{
				initPage(data);
			}
			
		}
	});
};

/**
 * form参数去空
 * @param formName
 */
function emptyParam(formName) {
	//提交参数
	var params = $('#' + formName).serialize();
	
	//提交参数字符串转化为参数数组
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
};

/**
 * 清空表单数据
 * @param  searchParam 要清空的字段，用“,”好分隔
 */
function clearForm(searchParam) {
	var params = searchParam.split(",");
	for (var i = 0; i < params.length; i++) {
		$("#" + params[i]).val("");
	}
};

/**
 * 分页跳转
 * @param  url 请求地址
 */
function pageGo(url) {
	// 添加GO跳转
	var pageInput = $("#pageInput").val();
	if(pageInput == "" || isNaN(pageInput)){
		pageInput=1;
	}
	var reg = /^\d{1,5}$/;
	if (!reg.test(pageInput)) {
		return;
	}
	if(parseInt(pageInput) < 1){
		pageInput = 1;
	}
	
	var maxPageNo = $("#maxPageNo").val();
	if (parseInt(pageInput) > parseInt(maxPageNo)) {
		pageInput = maxPageNo;
	}

	
	url = url + "&pageNo=" + pageInput;

	subForm(url);
};


$(function(){
	$("#pageInput").bind("keydown",function(e){
		var k = window.event ? e.keyCode : e.which;
        if (((k >= 48) && (k <= 57)) || (k == 8 || k == 0) || (k >= 96 && k <= 105)) {
        } else {
            if (window.event) {
                window.event.returnValue = false;
            }
            else {
                e.preventDefault(); //for firefox 
            }
        }
	});
});


/**
 * get提交，用户页面跳转
 * @param  url 必选，提交地址
 */
function go(url) {
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "GET",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		cache : false,
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			initPage(data);
		}
	});
};

/**
 * get提交，用户页面跳转
 * 同步提交
 * @param  url 必选，提交地址
 */
function goSync(url) {
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "GET",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		cache : false,
		async : false,
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			initPage(data);
		}
	});
};


/**
 * get提交，用户页面跳转
 * @param  url 必选，提交地址
 */
function postGo(url,data) {
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "POST",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		data : data,
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			initPage(data);
		}
	});
};



/**
 * get提交请求，打印返回提示
 * @param  url 必选，提交地址
 */
function show(url) {
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "GET",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			alert(data.message);
		}
	});
}

/**
 * 新窗口打开
 * @param  url 必选，提交地址
 */
function openwin(url,title) {
     var iWidth=800;                          //弹出窗口的宽度;
     var iHeight=600;                         //弹出窗口的高度;
     //获得窗口的垂直位置 
     var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
     //获得窗口的水平位置
     var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
     window.open(url, title, 'height=' + iHeight + ',,innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=1,titlebar=no'); 
}


/**
 * 显示提示消息
 * @param msg
 * @param fromId
 */
function showErrorMsg(msg, fromId) {
    var error1 = $('.alert-danger', $('#'+fromId));
    $("#errorMsg").html(msg);
    error1.show();
    Metronic.scrollTo(error1, -200);
}

/**
 * 隐藏消息提示框
 * @param fromId
 */
function hideErrorMsg(fromId) {
    var error1 = $('.alert-danger', $('#'+fromId));
    $("#errorMsg").html("");
    error1.hide();
}

/**
 * 初始化异常显示层
 * @param errorStatusId 异常状态
 * @param fromId 表单
 */
function initNoticeMessage(fromId){
	if ($("#returnMessaStatus").val()) {
	    var error1 = $('.alert-danger', $('#'+fromId));
	    error1.show();
	    Metronic.scrollTo(error1, -200);
	}
}

function showNoticeMessage(fromId,msg){
	$("#errorMsg").text(msg);
	var error1 = $('.alert-danger', $('#'+fromId));
    error1.show();
    Metronic.scrollTo(error1, -200);
}

function hideNoticeMessage(fromId){
	$("#errorMsg").text("");
	var error1 = $('.alert-danger', $('#'+fromId));
    error1.hide();
    Metronic.scrollTo(error1, -200);
}

function showConfirmMask(message,content){
	if(message){
		$("#confirmMaskMsg").html(message);
	}
	if(content){
		$("#confirmMaskContent").html(content);
	}
	$("#hideSubmitBtn").click();
}

/**
 * 设置确认提示框回调函数及参数
 * @param message 提示信息
 * @param callback 回调函数名
 * @param params 回调函数参数数组
 * @returns
 */
function showConfirmMaskAndSetCallBack(message,callback,params){
	if(message){
		$("#confirmMaskMsg").html(message);
	}
	//回调函数名不为空
	if(callback){
		//函数存在
		if(typeof eval(callback) === "function"){
			//确认按钮点击事件
			$("#ensure_sn").on("click",function(){
				//函数调用
				eval(callback).apply(null,params);
			})
		}
	}
	$("#hideSubmitBtn").click();
}

/** 新页面异步提交表单的方法， url 是提交路径 ， from 是表单名称！不填默认为searchForm */
/**
 * 新页面提交表单
 * @param  url 必选，提交地址
 * @param  form 可选，不填默认为searchForm
 */
function subForm2(url, form) {
	var formName = "searchForm";
	if (form) {
		formName = form;
	}
	
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "POST",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		data : $('#' + formName).serialize(),
		async : true,
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			initPage(data);
		}
	});
};

/**
 * 表单异步提交
 * @param url
 * @param form
 */
function subFormAsync(url, form) {
	var formName = "searchForm";
	if (form) {
		formName = form;
	}
	
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "POST",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		data : $('#' + formName).serialize(),
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			initPage(data);
		}
	});
};

/**
 * 新页面get提交，用户页面跳转
 * @param  url 必选，提交地址
 */
function go2(url) {
	Metronic.startPageLoading();//显示loadding
	
	$.ajax({
		type : "GET",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		error : function(request) {
			goSync("page/500");
		},
		success : function(data) {
			initPage(data);
		}
	});
}
/**
 * 创建带复选框的表格
 * @param id 表格id
 * @returns 
 */
function tableManager(id){
    var initTable2 = function () {
    	
        var table = $('#'+id);
        var tableWrapper = jQuery('#'+id+'_wrapper');

        table.find('.group-checkable').change(function () {
            var set = jQuery(this).attr("data-set");
            var checked = jQuery(this).is(":checked");
            jQuery(set).each(function () {
                if (checked) {
                    $(this).attr("checked", true);
                } else {
                    $(this).attr("checked", false);
                }
            });
            jQuery.uniform.update(set);
        });
        // initialize select2 dropdown
        tableWrapper.find('.dataTables_length select').select2(); 
    }

    return {
        //main function to initiate the module
        init: function () {
            if (!jQuery().dataTable) {
                return;
            }
            initTable2();
        },
        //获取所有被选择的行
        //返回行对象，属性列显示tdi,i为<td>的相对顺序，i的值从1开始
        getAllSelected:function(){
        	//表格对象
        	var table = $('#'+id);
        	//找到当前页所有被勾选的复选框
        	var checkBoxs = table.find("tbody tr td .checker .checked");
        	//行对象保存数组
        	var allSelected = [];
        	
        	$.each(checkBoxs,function(){
        		var obj = {};
        		//将td内的文本保存的对象属性中
        		$.each( $(this).parents("tr").find("td"),function(index){
        			obj["td"+(index+1)] = $(this).html();
        		})
        		allSelected.push(obj);
        	})
        	
        	return allSelected;
        }
    };
}
/**
 * 将滚动条移动到窗口顶端
 * @param id 元素id
 */
function scrollToTop(){
	/*//页面总高度
	var totalHeight = $("#jqxFrameRight").get(0).scrollHeight;
	//窗口显示高度
	var showHeight = $("#jqxNavigationBar").height();
	//元素距离窗口顶端长度
	var elementTop = $("#"+id).offset().top;*/
	
	$(".page-content-wrapper").scrollTop(0);
}

/**
 * 初始化关联时间控件
 * @param start 开始时间控件id
 * @param end 结束时间控件id
 */
function initLinkedDatepicker(start,end){
	$('#'+start+',#'+end).datepicker({
 	    format: 'yyyy/mm/dd',
 	    todayBtn : "linked",
 	    autoclose : true,
    	todayHighlight : true,
    	endDate : new Date()
 	});
 	$('#'+start).datepicker().on('changeDate', function(ev){
   		$('#'+end).datepicker('setStartDate', ev.date);
   	});
   	$('#'+end).datepicker().on('changeDate', function(ev){
   		$('#'+start).datepicker('setEndDate', ev.date);
   	});
}

/**
 * 统一填写页面数据,免得导出乱找
 * @param data
 */
function initPage(data){
	if(typeof(data)=="object" && data.responseText){
		data=data.responseText;
	}
	Metronic.stopPageLoading();//隐藏loadding
	if(isLogin(data)){		
		$('.page-content-wrapper').html(data);
		Layout.fixContentHeight(); // fix content height
		Metronic.initAjax(); // initialize core stuff
		Metronic.scrollTop();//加载完成回到顶部
	}
}

function isLogin(data){
	if(typeof(data)=="string" && data.indexOf('<meta id="login">')>=0){
		var title='注意';
	   	var content='<p>您已退出系统，是否重新登录？</p>';
	   	var msg='<textarea rows="5" class="form-control msgTextarea" style="display:none;" readonly="readonly">';
	   	msg+=sessionId;
	   	msg+='</textarea>';
	   	showModal("logoutModal",title,content+msg);
    	return false;
    }
	
	return true;
}

//登陆框显示错误信息
function showLoginMsg (obj) {
	$(obj).find('i').toggleClass('fa-chevron-circle-down fa-chevron-circle-up');
	$(obj).closest('.modal-content').find('.msgTextarea').slideToggle(300);
}

//确认框
function showModal(id,title,content){
	$("#"+id).find(".modal-title").html(title);
	$("#"+id).find(".modal-body").html(content);
	$("#"+id).modal("show");
}

Date.prototype.format = function(format) {
	var o = {
		"M+" : this.getMonth() + 1, // month
		"d+" : this.getDate(), // day
		"h+" : this.getHours(), // hour
		"m+" : this.getMinutes(), // minute
		"s+" : this.getSeconds(), // second
		"q+" : Math.floor((this.getMonth() + 3) / 3), // quarter
		"S" : this.getMilliseconds()
	// millisecond
	}

	if (/(y+)/.test(format)) {
		format = format.replace(RegExp.$1, (this.getFullYear() + "")
				.substr(4 - RegExp.$1.length));
	}

	for ( var k in o) {
		if (new RegExp("(" + k + ")").test(format)) {
			format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k]
					: ("00" + o[k]).substr(("" + o[k]).length));
		}
	}
	return format;
}

function showPDF(ossId){
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

var tk=0;
/**
 * 刷新token
 */
function flushToken(){
	var token=$("form > input[name='token']");
	if(token){
		var tokenValue=token.val();
		token.val(tokenValue+tk);
		tk++;
	}
};
/**
 * @author zhoukailiang
 * @createDate 2016年6月8日 下午12:26:18
 * @version 1.0
 * @description
 * 使用时请注意 一个处理逻辑里最好只有一个UI框 
 * 如果多个最后一个遮住前一个
 */

var JfchUi = {}
JfchUi.addPopOpen = function () {
    $('body').addClass('modal-open');
}
JfchUi.removePopOpen = function () {
    $('body').removeClass('modal-open');
}


/*confirm
 * @param obj.content       	内容
 * @param obj.callback          回调函数
 * @param obj.title             标题
 * @param obj.okBtn         	确定按钮文字
 * @param obj.cancelBtn     	取消按钮文字
*/
JfchUi.confirm = function (obj) {
	obj = obj || {};
	var promptId = "myModalPopConfirm"+ Date.parse(new Date()) + Math.floor((Math.random()*100000));
    var okBtn = obj.okBtn||"确定";
    var cancelBtn = obj.cancelBtn||"取消";
    var title = obj.title||'提示';
    var content = obj.content||'';
    var temp = '<div id="'+promptId+'" class="modal-scrollable" style="z-index: 10051;"><div class="modal fade in show" style="top:-100% ;opacity: 1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">' +
		    '<div class="modal-content">' +
				'<div class="modal-header">' +
					'<button type="button" class="close myModalPop-cancel" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' + 
					'<h4 class="modal-title">' + title + '</h4>' +
				'</div>' +
				'<div class="modal-body">' +
					content +
				'</div>' +
				'<div class="modal-footer">' +
					'<button data-bb-handler="confirm" type="button" data-dismiss="modal" class="btn btn-success btn-sub myModalPop-ok">'+ okBtn +'</button>' +
					'<button data-bb-handler="cancel" type="button" class="btn btn-default myModalPop-cancel" data-dismiss="modal" aria-label="Close">' + cancelBtn + '</button>'+
				'</div>'+
	    '</div>' +
	'</div>';
    $('body').append(temp);
    $("#"+promptId).find('.modal').animate({top:'10%'},300);
    JfchUi.addPopOpen();
    $('#'+promptId+' .myModalPop-cancel').click(function () {
        $('#'+promptId).fadeOut(600,function () {
            $(this).remove();
        });
        JfchUi.removePopOpen();
        if (typeof (obj.callback) == 'function') {
            obj.callback('cancel');
        }
    });
    $('#'+promptId+' .myModalPop-ok').click(function () {
        $('#'+promptId).fadeOut(600,function () {
            $(this).remove();
        });
        JfchUi.removePopOpen();
        if (typeof (obj.callback) == 'function') {
            obj.callback('ok');
        }
    });
}

/* edit
 * @param obj.content       	内容
 * @param obj.okBtn           	按钮文字
 * @param obj.callback          回调函数
 * @param obj.title             标题
 */
JfchUi.prompt = function (obj) {
	obj = obj || {};
	var promptId = "myModalPopPrompt"+ Date.parse(new Date()) + Math.floor((Math.random()*100000));
    var okBtn = obj.okBtn || "确定";
    var cancelBtn = obj.cancelBtn || "取消";
    var title = obj.title ||'编辑';
    var content = obj.content || '';
    var temp = '<div id="'+promptId+'" class="modal-scrollable" style="z-index: 10051;"><div class="modal fade in show" style="top:-100% ;opacity: 1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">' +
		    '<div class="modal-content">' +
				'<div class="modal-header">' +
					'<button type="button" class="close myModalPop-cancel" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' + 
					'<h4 class="modal-title">' + title + '</h4>' +
				'</div>' +
				'<div class="modal-body">' +
					content +
				'</div>' +
				'<div class="modal-footer">' +
					'<button data-bb-handler="confirm" type="button" data-dismiss="modal" class="btn btn-success btn-sub myModalPop-ok">'+ okBtn +'</button>' +
					'<button data-bb-handler="confirm" type="button" data-dismiss="modal" class="btn btn-default btn-sub myModalPop-cancel">'+ cancelBtn +'</button>' +
				'</div>'+
		    '</div>'+
	'</div></div>';
    if($("#"+promptId).length<=0){
    	$('body').append(temp);
        JfchUi.addPopOpen();	
    }
    $("#"+promptId).find('.modal').animate({top:'10%'},300);
    
    $('#'+promptId+' .myModalPop-ok').click(function () {

        if (typeof (obj.callback) == 'function') {
        	var result = obj.callback('ok');
             if(result != false){
            	 $('#'+promptId).remove();
                 JfchUi.removePopOpen(); 
             }
        }else{
        	 $('#'+promptId).remove();
             JfchUi.removePopOpen(); 
        };
    });
    $('#'+promptId+' .myModalPop-cancel').click(function () {
    	$('#'+promptId).remove();
        JfchUi.removePopOpen();
        if (typeof (obj.callback) == 'function') {
            obj.callback('cancel');
        };
    });
}

/* alert
 * @param obj.content       	内容
 * @param obj.okBtn           	按钮文字
 * @param obj.callback          回调函数
 * @param obj.title             标题
 */
JfchUi.alert = function (obj) {
	obj = obj || {};
	var promptId = "myModalPopAlert"+ Date.parse(new Date()) + Math.floor((Math.random()*100000));
    var title = obj.title||'信息提示';
    var img = obj.img||'';
    var okBtn = obj.okBtn||"确定";
    var content = obj.content||'';
    var cssClass = obj.cssClass||'';
    var temp = '<div id="'+promptId+'" class="modal-scrollable" style="z-index: 10051;"><div class="modal fade in show" style="top:-100% ;opacity: 1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">' +
		    '<div class="modal-content">' +
				'<div class="modal-header">' +
					'<button type="button" class="close myModalPop-cancel" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' + 
					'<h4 class="modal-title">'+ title + '</h4>' +
				'</div>' +
				'<div class="modal-body text-center"> ' +
				'<span class="text-'+cssClass+' font-lg" style="vertical-align: middle;display:inline-block;margin-top:-10px;margin-left:10px;">'+img +	
				content +'</span></div>' +
				'<div class="modal-footer">' +
					'<button data-bb-handler="confirm" type="button" data-dismiss="modal" class="btn btn-'+cssClass+' btn-sub myModalPop-ok">'+ okBtn +'</button>' +
				'</div>'+
		    '</div>'+
	'</div></div>';
    $('body').append(temp);
    $("#"+promptId).find('.modal').animate({top:'10%'},300);
    JfchUi.addPopOpen();
    $('#'+promptId+' .myModalPop-ok,.myModalPop-cancel').click(function () {
    	$('#'+promptId).remove();
        JfchUi.removePopOpen();
        if (typeof (obj.callback) == 'function') {
        	obj.callback('ok');
        }
    });
}

/* error
 * @param obj.content       	内容
 * @param obj.okBtn           	按钮文字
 * @param obj.callback          回调函数
 * @param obj.title             标题
 */
JfchUi.error = function (obj) {
	var o = obj || {}
	var errImg = '<span style="height:40px;line-height:40px;width:40px;text-align:center;display:inline-block;border:2px solid #F3565D;border-radius:50%;"><i class="fa fa-times text-danger" style="font-size:23px;"></i></span>';
	o.img = errImg;
	o.title = o.title || '错误信息提示';
	o.cssClass = 'danger';
	JfchUi.alert(o);
}
/* success
 * @param obj.content       	内容
 * @param obj.okBtn           	按钮文字
 * @param obj.callback          回调函数
 * @param obj.title             标题
 */
JfchUi.success = function (obj) {
	var o = obj || {}
	var errImg = '<span style="height:40px;line-height:40px;width:40px;text-align:center;display:inline-block;border:2px solid #26A69A;border-radius:50%;"><i class="fa fa-check text-success" style="font-size:23px;"></i></span>';
	o.img = errImg;
	o.title = o.title || '成功信息提示';
	o.cssClass = 'success';
	JfchUi.alert(o);
}
/* edit
 * @param obj.content       	内容
 * @param obj.okBtn           	按钮文字
 * @param obj.title             标题
 */
JfchUi.edit = function (obj) {
	var editObj = obj || {}
	editObj.title = editObj.title || '编辑输入框';
	JfchUi.prompt(editObj);
}


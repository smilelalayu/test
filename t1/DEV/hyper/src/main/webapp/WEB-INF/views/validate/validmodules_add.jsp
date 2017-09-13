<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">模块新增</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase"> 基本信息</span>
					</div>
				</div>
				<div class="portlet-body">
					<form action="" class="form-horizontal" id="formSubmitToSys">
						<div class="form-body">
								<div class="row ">
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">模块名<font color="red">*</font></label>		
											<div class="col-md-8">
												<input class="form-control" name = "modelName" id="modelName" placeholder="模块名" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">模块代码<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" name = "actionCode" id="actionCode" placeholder="模块代码" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
									
									<div class="form-group">
											<label class="col-md-4 control-label">系统代码<font color="red">*</font></label>
											<div class="col-md-8">
												<select class="form-control" name="context" id="context">
													<option value="">请选择</option>
													<c:forEach items="${appMap}" var="app">
													    <option value="${app.key }">${app.value}(${app.key })</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">权限页面</label>
											<div class="col-md-8">
												<input class="form-control" placeholder="权限页面" type="text" name="accessUrl" id="accessUrl">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">请求地址<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" placeholder="请求地址" type="text" name="postUrl" id="postUrl" >
											</div>
										</div>
									</div>
								</div>
							</div>
					</form>
					<div class="row">
						<div class="col-md-6">
						</div>
						<div class="col-md-6 text-right">
							<button class="btn grey" id='resetbutton'><i class="icon-refresh"></i> 重置</button>
							<button class="btn yellow-gold" id="formSubmit"><i class="icon-check"></i> 提交</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- END CONTENT -->
	
<script type="text/javascript">
	$('#formSubmit').on('click', function() {
		
		var modelName = $("#modelName").val();
		if(modelName.trim()==""){
			JfchUi.alert({content:'模块名不能为空 ！'})
			return;
		}
		var actionCode = $("#actionCode").val();
		if(actionCode.trim()==""){
			JfchUi.alert({content:'模块代码不能为空 ！'})
			return;
		}
		var context = $("#context").val();
		if(context.trim()==""){
			JfchUi.alert({content:'请选择系统代码 ！'})
			return;
		}
		var postUrl = $("#postUrl").val();
		if(postUrl.trim()==""){
			JfchUi.alert({content:'请求地址不能为空 ！'})
			return;
		}
		$.ajax({
	           type: "POST",
	           url: "valid/module/checkValidModules",
	           data: "context="+context+"&postUrl="+postUrl,
	           success: function(data){
	        	   var id = data.id;
	               if(id !=-1 ){
	            	    JfchUi.alert({content:'['+data.actionCode+']校验模块已经存在 ！'})
	               }else{
	            	    subForm2('valid/module/addSubmit','formSubmitToSys');
	               }
	           }
	     });
	});
	$('#resetbutton').on('click', function() {
	      $("#modelName").val("");
	      $("#actionCode").val("");
	      $("#postUrl").val("");
	      $("#accessUrl").val("");
	});
</script>
	
	
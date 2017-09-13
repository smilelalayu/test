<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">模块编辑</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase"> 基本信息</span>
					</div>
				</div>
				<div class="portlet-body">
					<form action="" class="form-horizontal" id="formSubmitToSys">
						<input name="id" value="${validModules.id}" type="hidden"/>
							<div class="form-body">
								<div class="row ">
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">模块名<font color="red">*</font></label>		
											<div class="col-md-8">
												<input class="form-control" value="${validModules.modelName }" name = "modelName" id="modelName" placeholder="模块名" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">模块代码<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" value="${validModules.actionCode }" readonly="readonly" id="actionCode" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
									
									<div class="form-group">
											<label class="col-md-4 control-label">系统代码<font color="red">*</font></label>
											<div class="col-md-8">							
											   <input class="form-control"  readonly="readonly" type="text" value="${validModules.context }">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">权限页面</label>
											<div class="col-md-8">
												<input class="form-control" value="${validModules.accessUrl }" placeholder="权限页面" type="text" name="accessUrl" id="accessUrl">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">请求地址<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" value="${validModules.postUrl }" readonly="readonly" type="text"  id="postUrl" >
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
		var postUrl = $("#postUrl").val();
		if(postUrl.trim()==""){
			JfchUi.alert({content:'请求地址不能为空 ！'})
			return;
		}
		subForm2('valid/module/updateSubmit','formSubmitToSys');
	});
	$('#resetbutton').on('click', function() {
		  $("#modelName").val("");
	      $("#accessUrl").val("");
	});

</script>

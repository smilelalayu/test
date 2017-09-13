<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>
<!--[if !IE]><!-->
	<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">鉴权新增</h1>
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
											<label class="col-md-4 control-label">用户名<font color="red">*</font></label>
											<input name="userId" value="" type="hidden" id="userId"/> 
											<div class="col-md-8">
												<input class="form-control" name = "loginName" id="loginName" placeholder="用户名" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">系统应用<font color="red">*</font></label>
											<div class="col-md-8">
												<select class="form-control" name="appCodeAndName" id="appCodeAndName">
													<option value="">请选择</option>
													<c:forEach items="${appMap}" var="app">
													    <option value="${app.key }:${app.value}">${app.value}(${app.key })</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">渠道</label>
											<div class="col-md-8">
												<select class="form-control" name="channelId" >
													<option value="">请选择</option>
													<c:forEach items="${userChannelMap}" var="app">
													    <option value="${app.id }">${app.name }</option>
													</c:forEach>
												</select>
											</div>
										</div> 
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">token值</label>
											<div class="col-md-8">
												<input class="form-control" placeholder="token值" type="text" name="token" value="${token}" readonly="readonly">
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
							<button class="btn grey" id='resetbutton'><i class="icon-refresh"></i>重置</button>
							<button class="btn yellow-gold" id="formSubmit"><i class="icon-check"></i>提交</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- END CONTENT -->
	<script type="text/javascript">
$(function() {
	var bool = false;
	$("#loginName").blur(function(){
		var loginName = $("#loginName").val();
		if(loginName.trim()!=""){
			$.ajax({
		           type: "POST",
		           url: "userauth/queryUserInfo",
		           data: "loginName="+loginName,
		           success: function(data){
		        	   var userId = data.userId;
		               if(userId !=-1 ){
		            	     $("#userId").val(userId);
		            	     bool = true;
		               }else{
		            	     JfchUi.alert({content:'['+loginName+']用户不存在 ！'})
		               }
		           }
		     });
		 } 
	});
	$('#formSubmit').on('click', function() {
		var loginName = $("#loginName").val();
		if(loginName.trim()==""){
			JfchUi.alert({content:'用户名不能为空 ！'})
			return;
		}
		var appCodeAndName = $("#appCodeAndName").val();
		if(appCodeAndName==""){
			JfchUi.alert({content:'请选择系统应用 ！'})
			return;
		}
		if(!bool){
			JfchUi.alert({content:'['+loginName+']用户不存在 ！'})
			return;
		}
		subForm2('userauth/addSubmit','formSubmitToSys');
	});
	$('#resetbutton').on('click', function() {
	      $("#loginName").val("");
	});
});
</script>
	
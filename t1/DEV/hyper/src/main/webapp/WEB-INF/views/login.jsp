<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="cntags"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<!-- TITLE BEGIN -->
	<title>登录</title>
	<!-- TITLE END -->
	<!-- 生成HTML Base标签 -->
	<cn:base/>
	<!-- META BEGIN -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta name="robots" content="noarchive">
	<meta id="login">
	<!-- META END -->

	<!-- CSS BEGIN -->
	<jsp:include page="/WEB-INF/views/common/style_common.jsp" />
	<link href="${publicPath}/assets/admin/pages/css/login-soft.css" rel="stylesheet" type="text/css"/>
	<!-- CSS END -->	
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="login-body">
<div class="login-box">
	<div class="col-md-6 col-md-offset-3">
		<div class="col-md-6 col-md-offset-3">
			<div class="login-logo-box text-center">
				<img src="${publicPath}/assets/admin/layout/img/logo-hm2.png" alt="logo" class="logo-default" />
				<span class="title">超能超级管理系统</span>
			</div>
			<div class="color-line2"></div>
			<div class="login-form-box">
				<form id="loginForm" class="login-form" action="login" method="post">
					<cntags:noticeMessage status="${resultMsg.success }" message="${resultMsg.message }"></cntags:noticeMessage>
					<div class="form-group">
						<div class="input-icon">
							<i class="icon-user"></i>
							<input id="username" name="username" type="text" class="form-control placeholder-no-fix" autocomplete="off" placeholder="用户名" />
						</div>
					</div>
					<div class="form-group">
						<div class="input-icon">
							<i class="icon-lock"></i>
							<input id="password" name="password" type="password" class="form-control placeholder-no-fix" autocomplete="off" placeholder="密码" />
						</div>
					</div>
					<button  id="loginButton" type="submit" class="btn btn-block btn-lg yellow-gold">登录</button>
					<input type="hidden" id="requestUrl" name = "requestUrl" value="${requestUrl}" />
				</form>
			</div>
		</div>
	</div>
</div>
	
	
	<!-- JS BEGIN -->
	<jsp:include page="/WEB-INF/views/common/js_common.jsp" />
	<script src="${publicPath}/assets/global/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
	<script>
		var publicPath = "${publicPath}";
	
		$(function() {
			Metronic.init(); // init metronic core components
			Metronic.setAssetsPath(publicPath+"/assets/");
			Layout.init(); // init current layout
			// init background slide images
			initNoticeMessage("loginForm");
	
			$("#loginButton").focus();
			// key enter event
			$(document).keydown(function(e) {
				if (e.keyCode == 13) {
					$("#loginButton").click();
				}
			});
		});
	</script>
	
	<!-- VALIDATE BEGIN -->
	<cn:validate asyn="false"/>
	<!-- VALIDATE END -->	
	<!-- JS END -->
</body>
<!-- END BODY -->
</html>
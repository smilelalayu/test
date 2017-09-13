<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<!-- TITLE BEGIN -->
	<title>玖富超能超管系统</title>
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
	<!-- META END -->

	<!-- CSS BEGIN -->
	<jsp:include page="/WEB-INF/views/common/style_common.jsp" />
	
		
	<!-- CSS END -->	
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-header-fixed page-header-fixed-mobile my-page-sidebar-fixed page-sidebar-closed-hide-logo">

	<div class="color-line"></div>
	<div class="page-header navbar navbar-fixed-top">
		<!-- TOP BEGIN -->
		<div class="page-header-inner">
			<!-- LOGO BEGIN -->
			<div class="page-logo">
				<a href="javascript:index();">
					<img src="${publicPath}/assets/admin/layout/img/logo-hm.png" alt="logo" class="logo-default"/>
				</a>
			</div>
			<div class="menu-toggler sidebar-toggler" style="display: inline-block;float: left;"></div>
			<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"></a>
			<!-- LOGO END -->
			
			<!-- TOP MENU BEGIN -->
			<div class="top-menu">
				<ul class="nav navbar-nav pull-right">
					<li class="dropdown dropdown-quick-sidebar-toggler">
						<a href="javascript:index();" class="dropdown-toggle">
							<i class="icon-home"></i>
						</a>
					</li>
					<li class="dropdown dropdown-user">
						<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">	
						<span class="username">你好！ ${user.loginName}</span>
						<i class="fa fa-angle-down"></i>
						</a>
						<ul class="dropdown-menu dropdown-menu-default">
							<li>
								<a href="javascript:void(0);">
								<i class="icon-key"></i>修改密码 </a>
							</li>
							<li>
								<a href="javascript:isLogout();">
								<i class="icon-logout"></i>登出</a>
							</li>
						</ul>
					</li>
					
					<li class="dropdown dropdown-quick-sidebar-toggler">
						<a href="javascript:isLogout();" class="dropdown-toggle">
						<i class="icon-logout"></i>
						</a>
					</li>
				</ul>
			</div>
			<!-- TOP MENU END -->
		</div>
		<!-- TOP END -->
	</div>
		
	<div class="clearfix"></div>
		
	<!-- CONTAINER BEGIN -->
	<div class="page-container">
		<!-- MENU BEGIN -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<ul class="page-sidebar-menu page-sidebar-menu-light" data-keep-expanded="false" data-slide-speed="200">
					<c:set var="first" value="true" />
					<c:forEach items="${menu}" var="item">
						<li class="<c:if test='${first}'>active open</c:if>">
							<a href="javaScript:;">
								<i class="${item.key.icon}"></i>
								<span class="title">${item.key.caption}</span>
								<span class="arrow <c:if test='${first}'>open</c:if>"></span>
							</a>
							<ul class="sub-menu">
								<c:forEach items="${item.value}" var="child">
									<li><a class="ajaxify" href="${child.url}">${child.caption}</a></li>
								</c:forEach>
							</ul>
						</li>
						<c:set var="first" value="false" />
					</c:forEach>
				</ul>
			</div>
		</div>
		<!-- MENU END -->
		<!-- CONTENT BEGIN -->
		<div class="page-content-wrapper"></div>
		<!-- CONTENT END -->
	</div>
	<!-- CONTAINER END -->
	
	<!-- 已退出提醒 -->
	<div id="logoutModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	    <div class="modal-content">
	    	<div class="modal-header">
	        	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        	<h4 class="modal-title"></h4>
	      	</div>
	      	<div class="modal-body"></div>
	      	<div class="modal-footer">
	      		<div class="pull-left text-warning" style="line-height:34px;cursor:pointer;" onclick="showLoginMsg(this)">
	      			<i class="fa fa-chevron-circle-down"></i> 客户端信息
	      		</div>
				<button data-bb-handler="confirm" type="button" class="btn btn-success" data-dismiss="modal" id="logoutConfirm" onclick="initLogin();">重新登录</button>
				<button data-bb-handler="cancel" type="button" class="btn btn-default" data-dismiss="modal" aria-label="Close" id="logoutCancel">我还想看看</button>
	      	</div>
	    </div>
	</div>
	
	<!-- 确认退出提醒 -->
	<div id="isLogoutModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	    <div class="modal-content">
	    	<div class="modal-header">
	        	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        	<h4 class="modal-title"></h4>
	      	</div>
	      	<div class="modal-body"></div>
	      	<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn yellow-gold" data-dismiss="modal" id="isLogoutConfirm" onclick="logout();">确认</button>
				<button data-bb-handler="cancel" type="button" class="btn btn-default" data-dismiss="modal" aria-label="Close" id="isLogoutCancel">取消</button>
	      	</div>
	    </div>
	</div>
	
	<!-- JS BEGIN -->
	<jsp:include page="/WEB-INF/views/common/js_common.jsp" />
	<script src="${appPath}/js/index.js" type="text/javascript"></script>
	<script>
		var publicPath = "${publicPath}";
		var sessionId = "${sessionId}";

		$(function() {
// 			$(window).bind('beforeunload', function() {
// 				logoutCheck("logout/check");
// 			});

			Metronic.init(); // init metronic core componets
			Metronic.setAssetsPath(publicPath+"/assets/");
			Layout.init(); // init layout
			//Demo.init();
			ComponentsPickers.init();
			UIExtendedModals.init();
	
			// 复位登出状态
// 			logoutCheck("logout/reset");
	
			index();
		});
	</script>
	<!-- JS END -->
</body>
<!-- END BODY -->
</html>
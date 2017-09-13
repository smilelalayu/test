<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>
<!--[if !IE]><!-->
<!-- BEGIN CONTENT -->">
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">白名单编辑</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase"> 基本信息</span>
					</div>
				</div>
				<div class="portlet-body">
					<form action="" class="form-horizontal" id="formSubmitToSys">
							 <input name="id" value="${whiteIp.id}" type="hidden"/> 
							<div class="form-body">
								<div class="row ">
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">白名单<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" value="${whiteIp.ip}"  type="text" name="ip" id="ip"  placeholder="白名单">
											</div>
										</div>
									</div>
									
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">系统代码<font color="red">*</font></label>
											<div class="col-md-8">
												<select class="form-control" name="appCode" id="appCode">
												<c:forEach items="${appMap}" var="app">		
														<c:choose>
														  <c:when test="${app.key == whiteIp.appCode }">
														       <option value="${app.key }" selected="selected">${app.key }(${app.value})</option>
														  </c:when>
														  <c:otherwise>
														       <option value="${app.key }">${app.key }(${app.value})</option>
														  </c:otherwise>					
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">描述</label>
											<div class="col-md-8">
												<input class="form-control" name="description" id="description" value="${whiteIp.description}" placeholder="描述" type="text" >
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">状态</label>
											<div class="col-md-8">
												<select class="form-control" name="status">		
														<c:choose>
														  <c:when test="${whiteIp.status == 0 }">
														       <option value="0" selected="selected">正常</option>
														       <option value="1" >关闭</option>
														  </c:when>
														  <c:otherwise>
														       <option value="1" selected="selected">关闭</option>
														       <option value="0" >正常</option>
														  </c:otherwise>								
														</c:choose>
												</select>
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
		var appCode = $("#appCode").val();
		if(appCode.trim()==""){
			 JfchUi.alert({content:'系统代码不能为空 ！'});
			 return;
		}
		var ip = $("#ip").val();
		if(ip.trim()==""){
			 JfchUi.alert({content:'白名单不能为空 ！'});
			 return;
		}
		subForm2('userauth/white/updateSubmit','formSubmitToSys');
	});
	$('#resetbutton').on('click', function() {
	      $("#ip").val("");
	      $("#appCode").val("");
	});
</script>

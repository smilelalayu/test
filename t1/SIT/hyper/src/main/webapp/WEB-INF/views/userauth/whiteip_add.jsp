<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>
<!--[if !IE]><!-->
<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">白名单新增</h1>
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
											<label class="col-md-4 control-label">白名单<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" name = "ip" id="ip" placeholder="白名单" type="text">
											</div>
										</div>
									</div>
									
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">系统代码<font color="red">*</font></label>
											<div class="col-md-8">
												<select class="form-control" name="appCode" id="appCode">
													<option value="">请选择</option>
													<c:forEach items="${appMap}" var="app">
													    <option value="${app.key }">${app.key }(${app.value})</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">描述</label>
											<div class="col-md-8">
												<input class="form-control" name="description" id="description" placeholder="描述" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">状态</label>
											<div class="col-md-8">
												<select class="form-control" name="status">
													<option value="0">正常</option>
													<option value="1">关闭</option>
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
			var ip = $("#ip").val();
			if(ip.trim()==""){
				 JfchUi.alert({content:'白名单不能为空 ！'});
				 return;
			}
			var appCode = $("#appCode").val();
			if(appCode.trim()==""){
				 JfchUi.alert({content:'系统代码不能为空 ！'});
				 return;
			}
			var appCodeAndName = $("#appCode").val();
			if(appCode==""){
				JfchUi.alert({content:'请选择系统代码 ！'})
				return;
			}
			subForm2('userauth/white/addSubmit','formSubmitToSys');
		});
		$('#resetbutton').on('click', function() {
		      $("#ip").val("");
		});
	</script>
	
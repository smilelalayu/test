<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>
<!--[if !IE]><!-->
	<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">鉴权编辑</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase">基本信息</span>
					</div>
				</div>
				<div class="portlet-body"> 
					<form action="" class="form-horizontal" id="formSubmitToSys">
                        <input name="id" value="${userApp.id}" type="hidden"/> 
					    <div class="form-body">
								<div class="row ">
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">用户名<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" value="${userApp.loginName}" readonly="readonly"  placeholder="用户名" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">系统应用<font color="red">*</font></label>
											<div class="col-md-8">
												<select class="form-control" name="appCodeAndName" id="appCodeAndName">
												<c:forEach items="${appMap}" var="app">
												
														<c:choose>
														
														  <c:when test="${app.key == userApp.appCode }">
														       <option value="${app.key }:${app.value}" selected="selected">${app.value}(${app.key })</option>
														  </c:when>
														  <c:otherwise>
														       <option value="${app.key }:${app.value}">${app.value}(${app.key })</option>
														  </c:otherwise>
														
														</c:choose>

													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">渠道名</label>
											<div class="col-md-8">
												<select class="form-control" name="channelId">
													<c:forEach items="${userChannelMap}" var="obj">				
													<c:choose>
													  <c:when test="${obj.id == userApp.channelId }">
													         <option value="${obj.id }" selected="selected">${obj.name }</option>
													  </c:when>
													  <c:otherwise>
													         <option value="${obj.id }">${obj.name }</option>
													  </c:otherwise>			
													</c:choose> 
													</c:forEach>			
												</select>
											</div>
										</div>
									</div>		
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">用户状态</label>
											<div class="col-md-8">
												<select class="form-control" name="userStatus">	
													<c:choose>
													  <c:when test="${userApp.userStatus eq 'normal' }">
													         <option value="normal" selected="selected">正常</option>
													         <option value="abnormal">不正常[冻结，暂停，锁定]</option>
													  </c:when>
													  <c:otherwise>
													         <option value="normal">正常</option>
													         <option value="abnormal" selected="selected">不正常[冻结，暂停，锁定]</option>
													  </c:otherwise>			
													</c:choose> 	
												</select>
											</div>
										</div>
									</div>						
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">token值</label>
											<div class="col-md-8">
												<div class="input-group">
							                        <input class="form-control" name="tokenStr"  id="tokenStr" value="${userApp.token}" placeholder="token值" type="text"  style="height: 32px;">
							                        <span class="input-group-btn">
							                        <button class="btn green" type="button" id="generateToken">重新生成</button>
							                        </span>
							                    </div>
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
		$('#formSubmit').on('click', function() {
			var appCodeAndName = $("#appCodeAndName").val();
			if(appCodeAndName==""){
				JfchUi.alert({content:'请选择系统应用 ！'})
				return;
			}
			subForm2('userauth/updateSubmit','formSubmitToSys');
		});
		$('#generateToken').on('click', function() {
			$.ajax({
		           type: "POST",
		           url: "userauth/generateToken",
		           data: null,
		           success: function(data){
		        	   $("#tokenStr").val(data.token);
		           }
		     });
		});
		
	</script>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!-- BEGIN CONTENT -->

		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">渠道编辑</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase"> 基本信息</span>
					</div>
				</div> 
				<div class="portlet-body">
					<form action="" class="form-horizontal" id="formSubmitToSys">		
                              <input name="id" value="${userChannel.id}" type="hidden"/> 
							<div class="form-body">
								<div class="row ">
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">渠道名<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" value="${userChannel.name}" name="name" id="name" placeholder="渠道名" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">渠道CODE<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" readonly="readonly" value="${userChannel.channelCode}"  type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">状态</label>
											<div class="col-md-8">
												<select class="form-control" name="status">		
														<c:choose>
														  <c:when test="${userChannel.status == 0 }">
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
		var name = $("#name").val();
		if(name.trim()==""){
			 JfchUi.alert({content:'渠道名不能为空 ！'});
			 return;
		}
		subForm2('userauth/channel/updateSubmit','formSubmitToSys');
	});
	$('#resetbutton').on('click', function() {
	      $("#name").val("");
	});
</script>
	
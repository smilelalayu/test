<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<div class="page-content">
	<cntags:confirmButton fn="exportFile();" content="确认导出推送日志？" message="注意"></cntags:confirmButton>
	<div class="row">
		<div class="col-md-12">
			<h2 class="page-title">推送日志查询</h2>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">查询条件</div>
				</div>
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form class="form-horizontal" id='searchForm' method="post">
						<div class="form-body">
							<!--/row-->
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">工单号</label>
										<div class="col-md-8">
											<input type="text" name="lnAppId" id="lnAppId" onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" value="${busSentLog.lnAppId}" class="form-control" placeholder="工单号" />
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">BUS批次号</label>
										<div class="col-md-8">
											<input type="text" name="batchNo" id="batchNO" value="${busSentLog.batchNo}" class="form-control" placeholder="BUS批次号" />
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">操作类型</label>
										<div class="col-md-8">
											<select name="busType" class="form-control">
												<option value="">===请选择===</option>
												<option value="1" ${busSentLog.busType=='1'?'selected':''}>发送至BUS</option>
												<option value="2" ${busSentLog.busType=='2'?'selected':''}>确认放款状态</option>
												<option value="3" ${busSentLog.busType=='3'?'selected':''}>生成还款计划</option>
												<option value="4" ${busSentLog.busType=='4'?'selected':''}>查询万卡额度系统日志</option>
												<option value="5" ${busSentLog.busType=='5'?'selected':''}>查询sc圈存额度系统</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">记录类型</label>
										<div class="col-md-8">
											<select name="recordType" class="form-control">
												<option value="">===请选择===</option>
												<option value="1" ${busSentLog.recordType=='1'?'selected':''}>交易日志</option>
												<option value="2" ${busSentLog.recordType=='2'?'selected':''}>检查日志</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">状态</label>
										<div class="col-md-8">
											<select name="state" class="form-control">
												<option value="">===请选择===</option>
												<option value="1" ${busSentLog.state=='1'?'selected':''}>成功</option>
												<option value="2" ${busSentLog.state=='2'?'selected':''}>失败</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">返回状态码</label>
										<div class="col-md-8">
											<input type="text" name="returnCode" id="returnCode" value="${busSentLog.returnCode}" class="form-control" placeholder="返回状态码" />
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">错误码</label>
										<div class="col-md-8">
											<input type="text" name="errorCode" id="errorCode" value="${busSentLog.errorCode}" class="form-control" placeholder="错误码" />
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">错误码内容</label>
										<div class="col-md-8">
											<input type="text" name="errorMsg" id="errorMsg" value="${busSentLog.errorMsg}" class="form-control" placeholder="错误码内容" />
										</div>
									</div>
								</div>

							</div>
							<div class="row">
								<div class="col-md-6"></div>
								<div class="col-md-6 text-right">
									<button type="button" onclick="subForm2('bus/log/querylist');" class="btn yellow-gold">
										<i class="fa fa-search"> 查询 </i>
									</button>
									<button type="button" id='resetbutton' class="btn btn-default">
										<i class="fa fa-refresh"> 重置 </i>
									</button>
								</div>
							</div>
						</div>
					</form>
					<!-- END FORM-->
				</div>
			</div>
			<!-- BEGIN PAGE CONTENT-->
			<c:if test="${pageReq.totalCount != null }">
				<div class="row">
					<div class="col-md-12">
						<div class="portlet light">
							<div class="portlet-title">
								<div class="caption">查询结果</div>
								<div class="actions">
									<c:if test="${pageReq.totalCount > 0}">
										<a id="sendLogDownload" href="javascript:void(0);" class="btn yellow-gold">
											<i class="fa fa-download"> </i>
											导出
										</a>
									</c:if>
								</div>
							</div>
							<div class="portlet-body">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>工单号</th>
											<th>BUS批次号</th>
											<th>操作类型</th>
											<th>记录类型</th>
											<th>状态</th>
											<th>返回状态码</th>
											<th>错误码</th>
											<th>错误码内容</th>
											<th>记录时间</th>
										</tr>
									</thead>
									<tbody>
										<c:if test="${empty pageReq.result }">
											<tr>
												<td colspan="10" style="text-align: center;">没有数据</td>
											</tr>
										</c:if>
										<c:forEach items="${pageReq.result}" var="log" varStatus="vsNo">
											<tr>
												<td>${log.lnAppId}</td>
												<td>${log.batchNo}</td>
												<td>
													<c:choose>
														<c:when test="${log.busType=='1'}">发送至BUS</c:when>
														<c:when test="${log.busType=='2'}">确认放款状态</c:when>
														<c:when test="${log.busType=='3'}">生成还款计划</c:when>
														<c:when test="${log.busType=='4'}">查询万卡额度系统日志</c:when>
														<c:when test="${log.busType=='5'}">查询sc圈存额度系统</c:when>
													</c:choose>
												</td>
												<td>
													<c:choose>
														<c:when test="${log.recordType=='1'}">交易日志</c:when>
														<c:when test="${log.recordType=='2'}">检查日志</c:when>
													</c:choose>
												</td>
												<td>
													<c:choose>
														<c:when test="${log.state=='1'}">成功</c:when>
														<c:when test="${log.state=='2'}">失败</c:when>
													</c:choose>
												</td>
												<td>${log.returnCode}</td>
												<td>${log.errorCode}</td>
												<td>${log.errorMsg}</td>

												<td>
													<fmt:formatDate value="${log.updateTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
												</td>
										</c:forEach>
									</tbody>
								</table>
								<cn:page url="bus/log/querylist" pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
							</div>
						</div>
					</div>
				</div>
			</c:if>
			<!-- END PAGE CONTENT-->
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function() {
		$('#resetbutton').click(
				function() {
					$(':input', '#searchForm').not(
							':button, :submit, :reset, :hidden').val('')
							.removeAttr('checked').removeAttr('selected')
							.trigger("change");
				});
		$('#sendLogDownload').on('click', function() {
			 showConfirmMask();
		});
	});
	var exportFile = function() {
		var $form = $("form")[0];
		$form.action = "bus/file/sendLogExp.gxtweb";
		$form.submit();
	}
</script>
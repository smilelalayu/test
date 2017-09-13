<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<div class="page-content">
	<div class="row">
		<div class="col-md-12">
			<h2 class="page-title">系统日志查询</h2>
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
										<label class="control-label col-md-4">异常信息</label>
										<div class="col-md-8">
											<input type="text" name="err" id="err" value="${busSysErrorLog.err}" class="form-control" placeholder="异常信息/异常源" />
										</div>
									</div>
								</div>
								<div class="col-md-5">
									<div class="form-group">
										<label class="col-md-4 control-label">异常日期</label>
										<div class="col-md-8">
											<div class="input-group date-picker input-daterange">
												<input type="text" name="beginDate" id="beginDate" value="<fmt:formatDate value="${busSysErrorLog.beginDate}" type="both" pattern="yyyy/MM/dd" />" class="form-control date-picker" placeholder="起始日期" />
												<span class="input-group-addon">to </span>
												<input type="text" name="endDate" id="endDate" value="<fmt:formatDate value="${busSysErrorLog.endDate}" type="both" pattern="yyyy/MM/dd" />" class="form-control date-picker" placeholder="结束日期" />
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6"></div>
								<div class="col-md-6 text-right">
									<button type="button" onclick="subForm2('bus/syslog/querylist');" class="btn yellow-gold">
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
							</div>
							<div class="portlet-body">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>编号</th>
											<th>异常信息</th>
											<th>异常源</th>
											<th>异常时间</th>
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
												<td>${log.id}</td>
												<td>${log.errMsg}</td>
												<td style="word-break: break-all;">${log.errThrowable}</td>
												<td>
													<fmt:formatDate value="${log.updateTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
												</td>
										</c:forEach>
									</tbody>
								</table>
								<cn:page url="bus/syslog/querylist" pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
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
		//初始化关联时间控件
		initLinkedDatepicker('beginDate', 'endDate');
		//查询时间初始化
		initQueryTime();
		//重置
		$('#resetbutton').click(
				function() {
					$(':input', '#searchForm').not(
							':button, :submit, :reset, :hidden').val('')
							.removeAttr('checked').removeAttr('selected')
							.trigger("change");
				});

	});
	/**
	 * 初始化查询时间
	 */
	function initQueryTime() {
		var initQueryTime = $("#initQueryTime").val();
		if ("true" == initQueryTime) {
			var date = new Date();
			var y = date.getFullYear();
			var m = date.getMonth() + 1;
			var d = date.getDate();

			if (parseInt(m) < 10) {
				m = "0" + m;
			}
			if (parseInt(d) < 10) {
				d = "0" + d;
			}
			var now = y + "/" + m + "/" + d;
			$("#beginDate").val(now);
			$("#endDate").val(now);
		}
	};
</script>
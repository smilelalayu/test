<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<div class="page-content">
	<cntags:confirmButton fn="exportFile();" content="确认导出工单？" message="注意"></cntags:confirmButton>
	<div class="row">
		<div class="col-md-12">
			<h2 class="page-title">推送工单查询</h2>
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
										<label class="control-label col-md-4">超能工单号</label>
										<div class="col-md-8">
											<input name="id" type="text" id="id" onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" value="${lnapp.id}" class="form-control" placeholder="超能工单号">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">BUS工单号</label>
										<div class="col-md-8">
											<input type="text" name="busAppid" id="busAppid" value="${lnapp.busAppid}" class="form-control" placeholder="BUS工单号" />
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">BUS批次号</label>
										<div class="col-md-8">
											<input type="text" name="batchNO" id="batchNO" value="${lnapp.batchNO}" class="form-control" placeholder="BUS批次号" />
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">贷款类型</label>
										<div class="col-md-8">
											<select name="loanType" class="form-control" id="loanType">
												<option value="">===请选择===</option>
												<option value="POS" ${lnapp.loanType=='POS'?'selected':''}>POS贷</option>
												<option value="AGR" ${lnapp.loanType=='AGR'?'selected':''}>农机贷</option>
												<option value="CASH" ${lnapp.loanType=='CASH'?'selected':''}>现金贷</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">发送BUS日期</label>
										<div class="col-md-8">
											<input type="text" name="sendBusTime" id="sendBusTime" value="<fmt:formatDate value="${lnapp.sendBusTime}" type="both" pattern="yyyy/MM/dd" />" class="form-control" placeholder="发送BUS日期" />
										</div>
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">工单状态</label>
										<div class="col-md-8">
											<select name="appState" class="form-control" id="appState">
												<option value="">===请选择===</option>
												<option value="35" ${lnapp.appState=='35'?'selected':''} selected="selected">待保理放款</option>
												<option value="36" ${lnapp.appState=='36'?'selected':''}>待BUS放款</option>
												<option value="32" ${lnapp.appState=='32'?'selected':''}>待放款</option>
												<option value="32X" ${lnapp.appState=='32X'?'selected':''}>待生成还款计划</option>
												<option value="50" ${lnapp.appState=='50'?'selected':''}>放款成功</option>

											</select>
										</div>
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">推BUS至50结果</label>
										<div class="col-md-8">
											<select name="proResult" class="form-control" id="proResult">
												<option value="">===请选择===</option>
												<option value="1" ${lnapp.proResult=='1'?'selected':''}>失败-ALL</option>
												<option value="2" ${lnapp.proResult=='2'?'selected':''}>失败-系统异常</option>
												<option value="3" ${lnapp.proResult=='3'?'selected':''}>失败-返回异常</option>

											</select>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6"></div>
							<div class="col-md-6 text-right">
								<button type="button" id="formSubmit" class="btn yellow-gold">
									<i class="fa fa-search"> 查询 </i>
								</button>
								<button type="button" id='resetbutton' class="btn btn-default">
									<i class="fa fa-refresh"> 重置 </i>
								</button>
							</div>
						</div>
					</form>
					<!-- END FORM-->
				</div>
			</div>
			<!-- BEGIN PAGE CONTENT-->
			<c:if test="${pageReq.totalCount != null }">
				<div class="row" id="result_contain">
					<div class="col-md-12">
						<div class="portlet light">
							<div class="portlet-title">
								<div class="caption">查询结果</div>
								<div class="actions">
									<c:if test="${lnapp.appState == '32'}">
										<c:choose>
											<c:when test="${btnflag == 'true' || pageReq.totalCount == 0}">
												<a id="btn" href="javascript:void(0);" class="btn yellow-gold disabled">
													<i class="fa fa-repeat"> </i>
													确认放款状态
												</a>
											</c:when>
											<c:otherwise>
												<a id="btnLoanConfirm" href="javascript:void(0);" class="btn yellow-gold">
													<i class="fa fa-repeat"> </i>
													确认放款状态
												</a>
											</c:otherwise>
										</c:choose>
									</c:if>

									<c:if test="${pageReq.totalCount > 0}">

										<a id="btnDownload" href="javascript:void(0);" class="btn yellow-gold">
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
												<th>超能工单号</th>
												<th>BUS工单号</th>
												<th>贷款类型</th>
												<th>BUS批次号</th>
												<th>客户名称</th>
												<th>身份证号码</th>
												<th>还款类型</th>
												<th>工单状态</th>
												<th>初次申请时间</th>
												<th>发送BUS时间</th>
												<th>BUS返回信息</th>
												<!-- <th>操作</th> -->
											</tr>
										</thead>
										<tbody>
											<c:if test="${empty pageReq.result }">
												<tr>
													<td colspan="12" style="text-align: center;">没有数据</td>
												</tr>
											</c:if>
											<c:forEach items="${pageReq.result}" var="app" varStatus="vsNo">
												<tr>
													<td>${app.id}</td>
													<td>${app.busAppid}</td>
													<td>
														<c:choose>
															<c:when test="${app.loanType=='POS'}">POS贷</c:when>
															<c:when test="${app.loanType=='AGR'}">农机贷</c:when>
															<c:when test="${app.loanType=='CASH'}">现金贷</c:when>
															<c:otherwise>${app.loanType}</c:otherwise>
														</c:choose>
													</td>
													<td>${app.batchNO}</td>
													<td>${app.customerName}</td>
													<td>${app.cardId}</td>
													<td>
														<c:choose>
															<c:when test="${app.repaymentType=='1'}">自主还款</c:when>
															<c:when test="${app.repaymentType=='2'}">银行代扣</c:when>
															<c:otherwise>${app.repaymentType}</c:otherwise>
														</c:choose>
													</td>
													<td>
														<c:choose>
															<c:when test="${app.realAppState=='35'}">待保理放款</c:when>
															<c:when test="${app.realAppState=='36'}">待BUS放款</c:when>
															<c:when test="${app.realAppState=='32'}">待放款</c:when>
															<c:when test="${app.realAppState=='32X'}">待生成还款计划</c:when>
															<c:when test="${app.realAppState=='50'}">放款成功</c:when>
															<c:otherwise>${app.realAppState}</c:otherwise>
														</c:choose>
													</td>
													<td>
														<fmt:formatDate value="${app.woBuildTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
													</td>
													<td>
														<fmt:formatDate value="${app.sendBusTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
													</td>
													<td>${app.busRetInfo}</td>
													<%-- <td><c:choose>
													<c:when
														test="${app.appState == '36' && app.busRetInfo != 'success'}">
														<a id='btnImportFail${app.id}' class="btnImportFail"
															data-dataid="${app.id}" style="color: blue;"> <i
															class="fa fa-chevron-circle-right"> 发送至BUS </i>
														</a>
													</c:when>
												</c:choose></td> --%>
												</tr>
											</c:forEach>
										</tbody>
									</table>
									<cn:page url="bus/app/querylist.gxtweb" pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
								</div>
						</div>
					</div>
					<!-- END PAGE CONTENT-->
				</div>
			</c:if>
		</div>
	</div>
	<!-- 确认单个工单推BUS提醒 -->
	<div id="isBatchImp" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title"></h4>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn  yellow-gold" data-dismiss="modal" id="isBatchImpConfirm">确认</button>
				<button data-bb-handler="cancel" type="button" class="btn  btn-default" data-dismiss="modal" aria-label="Close" id="isBatchImpCancel">取消</button>
			</div>
		</div>
	</div>

	<!-- 确认单个工单推BUS提醒 -->
	<div id="LoanConfirm" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title"></h4>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn  yellow-gold" data-dismiss="modal" id="LoanConfirmConfirm">确认</button>
				<button data-bb-handler="cancel" type="button" class="btn  btn-default" data-dismiss="modal" aria-label="Close" id="LoanConfirmCancel">取消</button>
			</div>
		</div>
	</div>


	<!-- 提醒 -->
	<div id="msg" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title"></h4>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn  yellow-gold" data-dismiss="modal" id="msgConfirm">确认</button>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript">
	$(function() {
		$('#btnDownload').on('click', function() {
					var appState = $('#appState').val();
					if (!appState) {
						var title = '注意';
						showModal("msg", title, "请选择工单状态查询进行导出!");
					} else {
						showConfirmMask();
					}
				});
		$('#btnLoanConfirm').on('click', function() {
			var title = '注意';
			var content = '<p>是否确认放款状态？</p>';
			showModal("LoanConfirm", title, content);
		});
		$('#formSubmit').on('click', function() {
			var appState = $('#appState').val();
			if (!appState) {
				var title = '注意';
				showModal("msg", title, "请选择工单状态查询");
			} else {
				subForm2('bus/app/querylist.gxtweb');
			}
		});
		$('#resetbutton').click(
				function() {
					$(':input', '#searchForm').not(
							':button, :submit, :reset, :hidden').val('')
							.removeAttr('checked').removeAttr('selected')
							.trigger("change");
					$("#appState").val(35);
				});
		$('#sendBusTime').datepicker({
			format : 'yyyy/mm/dd',
			todayBtn : "linked",
			autoclose : true,
			todayHighlight : true,
			endDate : new Date()
		});
		$('.btnImportFail').on('click', function() {
			//alert($(this).data("dataid"))
			$("#isBatchImpConfirm").val($(this).data("dataid"));
			var title = '注意';
			var content = '<p>是否将此工单发送至BUS？</p>';
			showModal("isBatchImp", title, content);
		});

		//批次推BUS方法
		$('#isBatchImpConfirm').on('click', function() {

			var lnAppId = $("#isBatchImpConfirm").val();
			var aid = 'btnImportFailln' + lnAppId;
			//alert(lnAppId)
			if (lnAppId) {
				$.ajax({
					type : "POST",
					dataType : "json",
					url : "bus/app/singleImp",
					data : {
						lnAppId : lnAppId
					},
					success : function(data) {
						if (data.status) {
							var title = '注意';
							showModal("msg", title, data.message);
						}
					}
				})
			}
			//TODO d
		});

		//确认放款状态方法
		$('#LoanConfirmConfirm').on('click', function() {
			$.ajax({
				type : "GET",
				dataType : "json",
				url : "bus/view/LoanAndRepaymentConfirm.gxtweb",
				success : function(data) {
					var title = '成功';
					showModal("msg", title, data.message);
				},
				error : function(data) {
					var title = '失败';
					showModal("msg", title, data.message);
				}
			})
		});

	});
	var exportFile = function() {
		var $form = $("form")[0];
		$form.action = "bus/file/exp.gxtweb";
		$form.submit();
	}
	//检查输入框是否为空
	var checkFormNotEmpty = function() {

	}
</script>
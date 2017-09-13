<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<div class="page-content">
	<div class="row">
		<div class="col-md-12">
			<h2 class="page-title">推送失败管理</h2>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">推BUS统计</div>
					<!-- <div class="actions">
						<a id="btnDownload" href="javascript:void(0);"
							class="btn btn-default btn-sm"> <i class="fa fa-download">
						</i> 导出失败记录
						</a>
					</div> -->
				</div>
				<div class="portlet-body">
					<table class="table table-striped table-bordered table-hover">
						<tr>
							<th width="35%">推BUS失败笔数</th>
							<th width="35%">待推BUS笔数</th>
							<th width="30%">操作</th>
						</tr>
						<tr>
							<td><span id = "busFialCount">请稍后</span></td>
							<td><span id = "busWaitCount">请稍后</span></td>
							<td>
								<div id="busFlag" style="display: none;">
									<a id="busConfirmButton" href="javascript:void(0);" class="btn btn-sm yellow-gold"> 重新推送BUS </a>
								</div>
								<div id="busFlagNot" style="display: none;">
									<a class="btn btn-sm yellow-gold disabled"> 重新推送BUS </a>
								</div>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="portlet light">
				<!--  -->
				<div class="portlet-title">
					<div class="caption">确认放款状态统计</div>
					<!-- <div class="actions">
						<a id="btnDownload" href="javascript:void(0);"
							class="btn btn-default btn-sm"> <i class="fa fa-download">
						</i>导出失败记录
						</a>
					</div> -->
				</div>
				<div class="portlet-body">
					<table class="table table-striped table-bordered table-hover">
						<tr>
							<th width="35%">确认放款状态失败笔数</th>
							<th width="35%">待确认放款状态笔数</th>
							<th width="30%">操作</th>
						</tr>
						<tr>
							<td><span id = "locfFailCount">请稍后</span></td>
							<td><span id = "locfWaitCount">请稍后</span></td>
							<td>
								<div id="loanConfirmFlag" style="display: none;">
									<c:if test="${loanflag == 'true'}">
										<a id="btnLoanConfirm" href="javascript:void(0);" class="btn btn-sm yellow-gold disabled"> 确认放款状态 </a>
									</c:if>
									<c:if test="${loanflag == 'false'}">
										<a id="btnLoanConfirm" href="javascript:void(0);" class="btn btn-sm yellow-gold"> 确认放款状态 </a>
									</c:if>
								</div>
								<div id="loanConfirmFlagNot" style="display: none;">
									<a href="javascript:void(0);" class="btn btn-sm yellow-gold disabled"> 确认放款状态 </a>
								</div>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="portlet light">
				<!--  -->
				<div class="portlet-title">
					<div class="caption">生成还款计划统计</div>
					<!-- <div class="actions">
						<a id="btnDownload" href="javascript:void(0);"
							class="btn btn-default btn-sm"><i class="fa fa-download">
						</i>导出失败记录 </a>
					</div> -->
				</div>
				<div class="portlet-body">
					<table class="table table-striped table-bordered table-hover">
						<tr>
							<th width="35%">生成还款计划失败笔数</th>
							<th width="35%">待生成还款计划笔数</th>
							<th width="30%">操作</th>
						</tr>
						<tr>
							<td><span id = "rePlanFailCount">请稍后</span></td>
							<td><span id = "rePlanWaitCount">请稍后</span></td>
							<td>
								<div id="repaymentPlanFlag" style="display: none;">
									<c:if test="${repaymentflag == 'true'}">
										<a id="btnRepaymentPlan" href="javascript:void(0);" class="btn btn-sm yellow-gold disabled"> 生成还款计划</a>
									</c:if>
									<c:if test="${repaymentflag == 'false'}">
										<a id="btnRepaymentPlan" href="javascript:void(0);" class="btn btn-sm yellow-gold"> 生成还款计划</a>
									</c:if>
								</div>
								<div id="repaymentPlanFlagNot" style="display: none;">
									<a id="btnRepaymentPlan" href="javascript:void(0);" class="btn btn-sm yellow-gold disabled"> 生成还款计划</a>
								</div>
							</td>
						</tr>
					</table>
				</div>
				<!--  -->
			</div>
		</div>
	</div>

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
			<button data-bb-handler="confirm" type="button" class="btn yellow-gold" data-dismiss="modal" id="butLoanConfirmConfirm">确认</button>
			<button data-bb-handler="cancel" type="button" class="btn btn-default" data-dismiss="modal" aria-label="Close" id="butLoanConfirmCancel">取消</button>
		</div>
	</div>
</div>
<div id="BusConfirm" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h4 class="modal-title"></h4>
		</div>
		<div class="modal-body"></div>
		<div class="modal-footer">
			<button data-bb-handler="confirm" type="button" class="btn yellow-gold" data-dismiss="modal" id="busConfirmConfirm">确认</button>
			<button data-bb-handler="cancel" type="button" class="btn btn-default" data-dismiss="modal" aria-label="Close" id="busConfirmCancel">取消</button>
		</div>
	</div>
</div>

<div id="Authentication" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h4 class="modal-title"></h4>
		</div>
		<div class="modal-body"></div>
		<div class="modal-footer">
			<button data-bb-handler="confirm" type="button" class="btn yellow-gold" data-dismiss="modal" id="butAuthenticationConfirm">确认</button>
			<button data-bb-handler="cancel" type="button" class="btn btn-default" data-dismiss="modal" aria-label="Close" id="butAuthenticationCancel">取消</button>
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
			<button data-bb-handler="confirm" type="button" class="btn yellow-gold" data-dismiss="modal" id="msgConfirm">确认</button>
		</div>
	</div>
</div>
</div>
<script type="text/javascript">
	//确认框
	function showModalDialog(id, title) {
		$("#" + id).find(".modal-title").html(title);
		$("#" + id).modal("show");
	};

	$(function() {
		$('#btnLoanConfirm').on('click', function() {
			var title = '注意';
			var content = '<p>是否确认放款状态？</p>';
			showModal("LoanConfirm", title, content);
			$('#butLoanConfirmConfirm').one('click', function() {
				runLoanConfirmTask();
				$('#btnLoanConfirm').addClass('disabled');
			});
		});
		$('#btnRepaymentPlan').on('click', function() {
			var title = '注意';
			var content = '<p>是否生成还款计划？</p>';
			showModal("Authentication", title, content);
			$('#butAuthenticationConfirm').one('click', function() {
				runRepaymentPlanTask();
				$('#btnRepaymentPlan').addClass('disabled');
			});
		});
		$('#busConfirmButton').on('click', function() {
			var title = '注意';
			var content = '<p>是否重新推送BUS？</p>';
			showModal("BusConfirm", title, content);
			$('#busConfirmConfirm').one('click', function() {
				busTask();
			});
		});
		busCount();
		loanConfirmCount();
		repaymentPlanCount();
	});
	
	$('#msgConfirm').on('click', function() {
		go('bus/view/infopage');
	});

	var runLoanConfirmTask = function() {
		$.ajax({
			type : "POST",
			url : "bus/view/LoanConfirm",
			data : $('#subForm').serialize(),
			async : false,
			success : function(data) {
				if (data.status) {
					var title = '成功';
					showModal("msg", title, data.message);
				} else {
					var title = '失败';
					showModal("msg", title, data.message);
				}
			},
			error : function(data) {
				var title = '失败';
				showModal("msg", title, data.message);
			}
		});
	};
	var runRepaymentPlanTask = function() {
		$.ajax({
			type : "POST",
			url : "bus/view/repaymentPlan",
			data : $('#subForm').serialize(),
			async : false,
			success : function(data) {
				if (data.status) {
					var title = '成功';
					showModal("msg", title, data.message);
				} else {
					var title = '失败';
					showModal("msg", title, data.message);
				}
			},
			error : function(data) {
				var title = '失败';
				showModal("msg", title, data.message);
			}
		});
	};

	var busTask = function() {
		$.ajax({
			type : "POST",
			url : "bus/view/fail36ToBus",
			success : function(data) {
				if (data.status) {
					var title = '成功';
					showModal("msg", title, data.message);
				} else {
					var title = '失败';
					showModal("msg", title, data.message);
				}
			},
			error : function(data) {
				var title = '失败';
				showModal("msg", title, data.message);
			}
		});
	};
   //推送BUS统计查询
   function busCount(){
		$.ajax({
			type : "POST",
			url : "bus/view/busFailCount",
			success : function(data) {
				if(data.status){
			    	$("#busFialCount").empty();
			    	$("#busFialCount").append(data.data['busFialCount']);
			    	$("#busWaitCount").empty();
			    	$("#busWaitCount").append(data.data['busWaitCount']);
				    if(data.data['busFialFlag']){
				    	//推送BUS失败不为0时候，显示可操作按钮
				    	$("#busFlag").show();
				    }else{
				    	//推送BUS失败为0时候，显示不可操作按钮
				    	$("#busFlagNot").show();
				    }
				}else{
// 					var title = '失败';
// 					showModal("msg", title, data.message);
					$("#busFialCount").empty();
			    	$("#busFialCount").append("<font color='#EA0000;'>"+data.message+"</font>");
			    	$("#busWaitCount").empty();
			    	$("#busWaitCount").append("<font color='#EA0000;'>"+data.message+"</font>");
				}
			},
			error : function(data) {
// 				var title = '失败';
// 				showModal("msg", title, data.message);
				$("#busFialCount").empty();
		    	$("#busFialCount").append("<font color='#EA0000;'>"+data.message+"</font>");
		    	$("#busWaitCount").empty();
		    	$("#busWaitCount").append("<font color='#EA0000;'>"+data.message+"</font>");
			}
		});
	};
	//放款统计查询
	function loanConfirmCount(){
		$.ajax({
			type : "POST",
			url : "bus/view/loanConfirmCount",
			success : function(data) {
				if(data.status){
					$("#locfFailCount").empty();
			    	$("#locfFailCount").append(data.data['locfFailCount']);
			    	$("#locfWaitCount").empty();
			    	$("#locfWaitCount").append(data.data['locfWaitCount']);
				    if(data.data['loanConfirmFailFlag'] || data.data['loanConfirmWaitFlag']){
				    	//放款失败和待放款都不为0时，显示可操作按钮
				    	$("#loanConfirmFlag").show();
				    }else if(!data.data['loanConfirmFailFlag'] && !data.data['loanConfirmWaitFlag']){
				    	//放款失败和待放款都为0时，显示不可操作按钮
				    	$("#loanConfirmFlagNot").show();
				    }
				}else{
// 					var title = '失败';
// 					showModal("msg", title, data.message);
					$("#locfFailCount").empty();
			    	$("#locfFailCount").append("<font color='#EA0000;'>"+data.message+"</font>");
			    	$("#locfWaitCount").empty();
			    	$("#locfWaitCount").append("<font color='#EA0000;'>"+data.message+"</font>");
				}
			},
			error : function(data) {
// 				var title = '失败';
// 				showModal("msg", title, data.message);
				$("#locfFailCount").empty();
		    	$("#locfFailCount").append("<font color='#EA0000;'>"+data.message+"</font>");
		    	$("#locfWaitCount").empty();
		    	$("#locfWaitCount").append("<font color='#EA0000;'>"+data.message+"</font>");
			}
		});
	};
	//生成还款计划查询
	function repaymentPlanCount(){
		$.ajax({
			type : "POST",
			url : "bus/view/repaymentPlanCount",
			success : function(data) {
				if(data.status){
					$("#rePlanFailCount").empty();
			    	$("#rePlanFailCount").append(data.data['rePlanFailCount']);
			    	$("#rePlanWaitCount").empty();
			    	$("#rePlanWaitCount").append(data.data['rePlanWaitCount']);
				    if(data.data['repaymentPlanFailFlag'] || data.data['repaymentPlanWailFlag']){
				    	//生成还款失败或待生成都不为0时，显示可操作按钮
				    	$("#repaymentPlanFlag").show();
				    }else if(!data.data['repaymentPlanFailFlag'] && !data.data['repaymentPlanWailFlag']){
				    	//生成还款失败或待生成都为0时，显示不可操作按钮
				    	$("#repaymentPlanFlagNot").show();
				    }
				}else{
// 					var title = '失败';
// 					showModal("msg", title, data.message);
					$("#rePlanFailCount").empty();
			    	$("#rePlanFailCount").append("<font color='#EA0000;'>"+data.message+"</font>");
			    	$("#rePlanWaitCount").empty();
			    	$("#rePlanWaitCount").append("<font color='#EA0000;'>"+data.message+"</font>");
				}
			},
			error : function(data) {
// 				var title = '失败';
// 				showModal("msg", title, data.message);
				$("#rePlanFailCount").empty();
		    	$("#rePlanFailCount").append("<font color='#EA0000;'>"+data.message+"</font>");
		    	$("#rePlanWaitCount").empty();
		    	$("#rePlanWaitCount").append("<font color='#EA0000;'>"+data.message+"</font>");
			}
		});
	};
</script>
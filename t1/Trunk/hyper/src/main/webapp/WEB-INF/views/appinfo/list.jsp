<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!--[if !IE]><!-->
<script type="text/javascript" src="${appPath}/js/appinfo/list.js"></script>
<div class="page-content">
	<div class="row">
	<div class="col-md-12">
	<h2 class="page-title">工单查询</h2>
	<c:if test="${!empty reSendWkResult}">
		<div class="alert alert-warning alert-dismissable bg-yellow-saffron">
			<button type="button" class="close" data-dismiss="alert" aria-hidden="true" style="right: -15px;top: 5px;"></button>
			<strong>${reSendWkResult }</strong> 
		</div>
	</c:if>
	<div class="portlet light">
		<div class="portlet-title">
			<div class="caption">查询条件</div>
		</div>
		<div class="portlet-body form">
			<!-- BEGIN FORM-->
			<form class="form-horizontal" id='searchForm' method="post">
				<input type="hidden" id="reSendType">
				<input type="hidden" id="appId">
				<div class="form-body">
					<!--/row-->
					<div class="row">
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">工单号</label>
								<div class="col-md-8">
									<input type="text" name="id" id="id" class="form-control" 
													value="${pageReq.t.id }" placeholder="请输入" />
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">申请人姓名</label>
								<div class="col-md-8">
									<input type="text" name="customerName" id="customerName" class="form-control" 
													value="${pageReq.t.customerName }" placeholder="申请人姓名" />
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">身份证号</label>
								<div class="col-md-8">
									<input type="text" name="cardId" id="cardId" class="form-control" 
													value="${pageReq.t.cardId }" placeholder="身份证号" />
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">发送万卡</label>
								<div class="col-md-8">
									<select class="form-control" id="isSendWk" name="isSendWk">
											<option value="">请选择</option>
											<option value="Y" ${pageReq.t.isSendWk=='Y'?'selected':''} >Y</option>
											<option value="N" ${pageReq.t.isSendWk=='N'?'selected':''} >N</option>
									</select>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">工单状态</label>
								<div class="col-md-8">
									 <cn:select name="appState" items="${appStatus }" id="appState" selectClass="form-control" 
											optionHtml="statusDesc" optionValue="code" selected="${pageReq.t.appState }"  
													defalutOptionHtml="请选择" defalutOptionValue=" "  /> 
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">贷款类型</label>
								<div class="col-md-8">
									<select class="form-control" id="loanType" name="loanType">
											<option value="">请选择</option>
											<option value="POS" ${pageReq.t.loanType=='POS'?'selected':''}>POS贷</option>
											<option value="CASH" ${pageReq.t.loanType=='CASH'?'selected':''}>现金贷</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">申请时间</label>
								<div class="col-md-8">
									<input type="text" id="startTime" name="startTime" 
										value="${pageReq.t.startTime}" class="form-control" placeholder="请选择" />
								</div>
								<%-- <div class="col-md-1" style="width: 12px;height: 34px;padding: 7px 0 0 0;">--</div>
								<div class="col-md-4">
									<input type="text" id="endTime" name="endTime" 
										value="${pageReq.t.endTime}" class="form-control" placeholder="请选择" />
								</div> --%>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">至</label>
								<div class="col-md-8">
									<input type="text" id="endTime" name="endTime" 
										value="${pageReq.t.endTime}" class="form-control" placeholder="请选择" />
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6"  >
					    <!-- <div id="reSendDiv"  class="hide">
						<button type="button" onclick="reSend(0,'wk');" class="btn red">
							重发万卡
						</button>
						</div> -->
					</div>
					<div class="col-md-6 text-right">
							<button type="button" onclick="subForm('appinfo/appHM/list?pageNo=1','searchForm');" class="btn yellow-gold"><i class="fa fa-search"></i>查询</button>
							<button type="button" onclick="resetForm('searchForm');" class="btn btn-default""><i class="fa fa-refresh"></i>重置</button>
					</div>
				</div>
			</form>
			<!-- END FORM-->
		</div>
	</div>
	<!-- BEGIN PAGE CONTENT-->
	<c:if test="${!empty pageReq.result}">
	<c:if test="${!empty reSendWkFlag}">
		<div class="alert alert-warning alert-dismissable bg-yellow-saffron">
			<button type="button" class="close" data-dismiss="alert" aria-hidden="true" style="right: -15px;top: 5px;"></button>
			<strong>批量发送万卡正在执行...</strong> 
		</div>
	</c:if>
	<div class="row" id="result_contain">
		<div class="col-md-12">
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">查询结果</div>
					<div class="actions">
						<div class="btn-group">
							<a class="btn btn-default btn-sm" href="javascript:;" data-toggle="dropdown">
							<i class="fa fa-cogs"></i> 批量操作 <i class="fa fa-angle-down"></i>
							</a>
							<ul class="dropdown-menu pull-right">
								<li id="reSendDiv" class="hide">
									<c:if test="${reSendWkFlag ne 'Y'}">
										<a href="javascript:reSend(0,'wk');">
										<i class="fa fa-circle-o"></i> 重发万卡 </a>
									</c:if>
									<c:if test="${reSendWkFlag eq 'Y'}">
										<a href="javascript:;">
										<i class="fa fa-ban"></i> 执行中... </a>
									</c:if>
								</li>
								<li id="reSendDelayRefuse" class="hide">
									<c:if test="${mdl.appState ne '81'}">
										<a href="javascript:;" onclick="go('appinfo/appHM/updateDelayRefuse');">
										<i class="fa fa-circle-o"></i>工单延迟拒绝 </a>
									</c:if>
									<c:if test="${mdl.appState eq '81'}">
										<a href="javascript:;">
										<i class="fa fa-ban"></i> 执行中... </a>
									</c:if>
								</li>
								<li id="reSendAutoRefuse">
									<a href="javascript:;" onclick="go('appinfo/appHM/updateRevoke');">
									<i class="fa fa-circle-o"></i>工单撤销 </a>	
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="portlet-body">
					<div class="table-scrollable">
					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<th>工单编号</th>
								<th>门店名称</th>
<!-- 								<th>产品系列</th> -->
								<th>申请人姓名</th>
								<th>申请金额</th>
								<th>销售顾问</th>
								<th>工单状态</th>
<!-- 								<th>合同状态</th> -->
								<th>申请时间</th>
								<th>贷款类型</th>
								<th>发送万卡</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageReq.result}" var="mdl" varStatus="vsNo">
								<tr>
									<td>
										<a href="javascript:toDetail('${mdl.id}');">${mdl.id }</a>
									</td>
									<td>${mdl.shopName }</td>
<%-- 									<td>${mdl.productSeriesName }</td> --%>
									<td>${mdl.customerName }</td>
									<td><fmt:formatNumber value="${mdl.loanMoney }" type="currency" pattern="#"/></td>
									<td>${mdl.saName }</td>
									<td>
										<span class="label label-sm label-${mdl.showClass }">${mdl.appStateName }</span>
										
									</td>
<%-- 									<td>${mdl.contractStateName }</td> --%>
									<td>
										<fmt:formatDate value="${mdl.woBuildTime }"  type="both"/>
									</td>
									<td>
										${mdl.loanType }
									</td>
									<td>
										${mdl.isSendWk }
									</td>
									<td>
<!-- 										<shiro:hasPermission name="app:reSend:*"> -->
											<c:if test="${mdl.appState eq '11' }">
												<a href="javascript:reSend(${mdl.id},'fk');" class="btn btn-xs blue-madison btn-qr">重发风控</a>
											</c:if>
<!-- 										</shiro:hasPermission> -->
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<cn:page url="appinfo/appHM/list"
									pageSize="${pageReq.pageSize}"
									totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
			</div>
			</div>
		</div>
	</div>
	</c:if>
	<!-- END PAGE CONTENT-->
	</div>
	</div>
</div>


<div id="mymodal4" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" style=" text-align:center;">注意</h4>
      </div>
      <div class="modal-body">
      		<div class="row">
      			<div class="col-md-12">
		      		<p style=" text-align:center;">请确认是否发送？</p>
					<div class="clearfix"></div>
      			</div>
      		</div>
      </div>
      <div class="modal-footer">
		<button data-bb-handler="confirm" type="button" onclick="reSendSure();" class="btn btn-success btn-sub2">确认</button>
		<button data-bb-handler="cancel" type="button" onclick="sendDivHide()" class="btn btn-default" data-dismiss="modal" aria-label="Close">取消</button>
      </div>
    </div>
</div>
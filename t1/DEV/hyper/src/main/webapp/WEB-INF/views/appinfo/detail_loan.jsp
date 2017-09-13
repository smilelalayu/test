<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="page-content">
	<h3 class="page-title">查看工单</h3>
	<input type="hidden" id="ossUrl" value=""> <input type="hidden"
		id="ossUrl" value="">
	<div class="portlet light form-horizontal">
		<div class="caption margin-bottom-10">
			<div class="row">
				<div class="col-md-12">
				  	<div class="form-actions text-right">
						<a href="javascript:reback('${reqParm}');" class="btn bg-grey-silver btn-sm" > <i class="fa fa-arrow-left"></i> 返回 </a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5"><strong>工单编号：</strong></label>
						<div class="col-md-7">
							<p class="form-control-static">
								<strong>${lnApp.id }</strong>
							</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5">销售商户：</label>
						<div class="col-md-7">
							<p class="form-control-static">${lnApp.firmName }</p>
						</div>
					</div>
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5">销售门店：</label>
						<div class="col-md-7">
							<p class="form-control-static">${lnApp.shopName }</p>
						</div>
					</div>
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5">门店性质：</label>
						<div class="col-md-7">
							<p class="form-control-static">${storeCharacter }</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5">销售代表：</label>
						<div class="col-md-7">
							<p class="form-control-static">${lnApp.saName }</p>
						</div>
					</div>
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5">客户姓名：</label>
						<div class="col-md-7">
							<p class="form-control-static">${lnApp.customerName }</p>
						</div>
					</div>
					<div class="form-group col-md-4 no-margin">
						<label class="control-label col-md-5">客户手机号：</label>
						<div class="col-md-7">
							<p class="form-control-static">${lnApp.mobile }</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tabbable">
			<ul class="nav nav-tabs">
				<li class="active"><a href="javascript:void(0);"> 贷款信息 </a></li>
			</ul>
			<div class="tab-content no-space form-horizontal margin-top-20">
				<div class="tab-pane active" id="tab_general">
					<div class="row">
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">申请人姓名<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.customerName }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">手机号码<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.mobile }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">申请人身份证号<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.cardId }</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">门店选择</label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.shopName }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">职业选择<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${custinfo.career }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">还款类型<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.repaymentType }</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">客户银行账户名</label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.repaymentAccName }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">开户行地址<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.repaymentCity }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">招行虚拟还款账号<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.selfRepayAccount }</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">银行卡开户手机</label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.bankTel }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">客户开户银行<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.repaymentBank }</p>
							</div>
						</div>
						<div class="form-group col-md-4 col-sm-4">
							<label class="col-md-5 control-label">客户银行账号<span
								class="required" aria-required="true"> * </span></label>
							<div class="col-md-7">
								<p class="form-control-static">${lnApp.repaymentAcc }</p>
							</div>
						</div>
					</div>

					<h4 class="margin-top-20">贷款信息</h4>
					<div class="portlet-body">
						<div class="table-scrollable">
							<table
								class="table table-bordered table-hover dataTable no-footer">
								<thead>
									<tr role="row" class="heading">
										<th width="20%">货物类别</th>
										<th width="20%">商品类型</th>
										<th width="20%">商品品牌</th>
										<th width="20%">商品型号</th>
										<th width="20%">商品价格(元)</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${commoditys}" var="commodity"
										varStatus="vsNo">
										<tr class="odd gradeX">
											<td>${commodity.cargoType}</td>
											<td>${commodity.commodityClass}</td>
											<td>${commodity.commodityName}</td>
											<td>${commodity.commodityType}</td>
											<td><fmt:formatNumber
													value="${commodity.commodityPrice }" pattern="#,#00.00#" /></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>

						<div class="row">
							<div class="form-group col-md-4 col-sm-4 no-margin">
								<label class="col-md-7 control-label">商品总价格(元)：</label>
								<div class="col-md-5">
									<p class="form-control-static">${lnApp.amount }</p>
								</div>
							</div>
							<div class="form-group col-md-4 col-sm-4 no-margin">
								<label class="col-md-6 control-label">自付金额(元)*：</label>
								<div class="col-md-6">
									<p class="form-control-static">${lnApp.downPaymentAmount }</p>
								</div>
							</div>
							<div class="form-group col-md-4 col-sm-4 no-margin">
								<label class="col-md-6 control-label">商品余额(元)：</label>
								<div class="col-md-6">
									<p class="form-control-static">${lnApp.loanMoney }</p>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-4 col-sm-4 no-margin">
								<label class="col-md-7 control-label">购买保险：</label>
								<div class="col-md-5">
									<p class="form-control-static">${lnApp.buyInsurance ? '是' : '否' }</p>
								</div>
							</div>
							<div class="form-group col-md-4 col-sm-4 no-margin">
								<label class="col-md-6 control-label">产品系列：</label>
								<div class="col-md-6">
									<p class="form-control-static">${lnApp.productName}</p>
								</div>
							</div>
							<div class="form-group col-md-4 col-sm-4 no-margin">
								<label class="col-md-6 control-label">分期数：</label>
								<div class="col-md-6">
									<p class="form-control-static">${lnApp.periods}</p>
								</div>
							</div>
						</div>

						<c:if test="${not empty repayPlan }">
							<div class="row">
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-7 control-label">月均信用管理费：</label>
									<div class="col-md-5">
										<p class="form-control-static">
											<fmt:formatNumber value="${repayPlan.infoFee }" type="number"
												pattern="0.00%" />
										</p>
									</div>
								</div>
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-6 control-label">月均手续费(元)：</label>
									<div class="col-md-6">
										<p class="form-control-static">${repayPlan.monthlyFee }</p>
									</div>
								</div>
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-6 control-label">首次还款日：</label>
									<div class="col-md-6">
										<p class="form-control-static">${repayPlan.firstRepayDate }</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-7 control-label">月均咨询服务费：</label>
									<div class="col-md-5">
										<p class="form-control-static">
											<fmt:formatNumber value="${repayPlan.consultFee }"
												type="number" pattern="0.00%" />
										</p>
									</div>
								</div>
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-6 control-label">月还款额(元)：</label>
									<div class="col-md-6">
										<p class="form-control-static">${repayPlan.monRepAmt }</p>
									</div>
								</div>
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-6 control-label">月还款日：</label>
									<div class="col-md-6">
										<p class="form-control-static">${repayPlan.monRepayDay }</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-4 col-sm-4 no-margin">
									<label class="col-md-7 control-label">月贷款利率：</label>
									<div class="col-md-5">
										<p class="form-control-static">
											<fmt:formatNumber value="${repayPlan.monRate }" type="number"
												pattern="0.00%" />
										</p>
									</div>
								</div>
							</div>
						</c:if>
					</div>

					<c:if test="${not empty contracttInfos }">
						<h3 class="margin-top-20">合同信息</h3>
						<div class="row">
							<div class="col-md-12">
								<div class="portlet-body">
									<table class="table table-striped table-bordered table-hover">
										<thead>
											<tr>
												<th>材料类型</th>
												<th>最后上传时间</th>
												<th>操作</th>

											</tr>
										</thead>
										<tbody>
											<c:forEach items="${contracttInfos }" var="contract">
												<tr class="odd gradeX">
													<td>${contract.contractName }</td>
													<td><fmt:formatDate value="${contract.modifiedon }"
															type="both" /></td>
													<td><c:if test="${contract.ossIdUrl ne '' }">
															<a href="javascript:showPDF('${contract.ossId }')">查看</a>
														</c:if></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</c:if>
				</div>
			</div>
		</div>
	</div>
	
	<jsp:include page="/WEB-INF/views/appinfo/update_loan.jsp" />
	
</div>

<script type="text/javascript" src="${appPath}/js/appinfo/list.js"></script>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<c:if test="${lnApp.appStatesShow eq 'Y' }">
<h3 class="margin-top-20">资料变更</h3>
<div class="portlet light form-horizontal">
	<div class="tabbable">
		<div class="panel-body no-margin">
			<div class="row">
				<c:if test="${lnApp.appState eq '70' }">
					<div class="col-md-6">
						<div class="form-group col-md-8 col-sm-8 no-margin">
							<label class="col-md-6 control-label">工单上一个状态：</label>
							<div class="col-md-4">
								<p class="form-control-static">${lnApp.oldAppStateName }</p>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${lnApp.appState eq '35' or lnApp.appState eq '36' or lnApp.appState eq '32'}">
					<div class="col-md-6">
						<div class="form-group col-md-8 col-sm-8 no-margin">
							<label class="col-md-6 control-label">工单当前状态：</label>
							<div class="col-md-4">
								<p class="form-control-static">${lnApp.appStateName }</p>
							</div>
						</div>
					</div>
				</c:if>
				<div class="col-md-4">
					<div class="form-group has-error">
						<label class="control-label col-md-4" style="color:#333 !important;padding-top:3px;">状态变更：</label>
						<div class="col-md-8">
							
								<select class="form-filter input-sm" id="appStatus"
									name="appStatus">
									<option value="">请选择状态</option>
									<c:if test="${lnApp.appState eq '31' }">
										<option value="20">待生成合同</option>
									</c:if>
									<c:if test="${lnApp.appState eq '70' }">
										<option value="70">取消撤销</option>
									</c:if>
									<c:if test="${lnApp.appState eq '35' or lnApp.appState eq '36' or lnApp.appState eq '32'}">
										<option value="70_Manual">人工撤销</option>
									</c:if>
								</select>
								<span class="help-block help-block-error hide">请选择工单状态</span>
							
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="form-actions text-right">
			<c:if test="${lnApp.isSubmit eq 'Y' }">
				<a href="javascript:submit('${lnApp.id}');"
					class="btn yellow-gold"><i class="fa fa-check"></i>提交</a>
			</c:if>
			<a href="javascript:reback('${reqParm}');"
				class="btn bg-grey-silver btn-sm"> <i class="fa fa-arrow-left"></i>
				返回
			</a>
		</div>
	</div>
</div>
</c:if>

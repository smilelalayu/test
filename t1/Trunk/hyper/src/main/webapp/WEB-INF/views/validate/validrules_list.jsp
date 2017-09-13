<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!--[if !IE]><!-->
<div class="page-content">
	<div class="row">
	<div class="col-md-12">
	<h2 class="page-title">规则列表</h2>
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
								<label class="control-label col-md-4">规则代码</label>
								<div class="col-md-8">
									<input type="text" name="ruleCode" id="ruleCode" class="form-control" value="${validRules.ruleCode }" placeholder="模块名" />
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label class="control-label col-md-4">规则名</label>
								<div class="col-md-8">
									<input type="text" name="ruleName" id="ruleName" class="form-control" value="${validRules.ruleName }" placeholder="模块代码" />
								</div>
							</div>
						</div>
				    </div>
					<div class="row">
						<div class="col-md-6">
							<button type="button" onclick="go('valid/rule/add');"class="btn yellow-gold">
								新增
							</button>
						</div>
						<div class="col-md-6 text-right">
						        <button type="button" id='resetbutton'  class="btn btn-default"><i class="fa fa-refresh"></i>重置</button>
								<button type="button" id="formSubmit"  class="btn yellow-gold"><i class="fa fa-search"></i>查询</button>
						</div>
					</div>
				</div>
			</form>
			<!-- END FORM-->
		</div>
	</div>
	<!-- BEGIN PAGE CONTENT-->
	<c:if test="${!empty pageReq}">
	<div class="row" id="result_contain">
		<div class="col-md-12">
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">查询结果</div>
				</div>
				<div class="portlet-body">
					<div class="table-scrollable">
					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<th>序号</th>
								<th>规则代码</th>
								<th>规则名</th>
								<th>正则表达式</th>
								<th>函数</th>
								<th>公式</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageReq.result}" var="mdl">
								<tr>
									<td>${mdl.id }</td>
									<td>${mdl.ruleCode }</td>
									<td>${mdl.ruleName }</td>
									<td>${mdl.expression }</td>
									<td>${mdl.function }</td>
									<td>${mdl.formula }</td>
									<td>
									<a class="btn btn-xs blue" href="javascript:go('valid/rule/update?id=${mdl.id}');"> 编辑</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<cn:page url="valid/rule/querylist"	pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
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
	$('#formSubmit').on('click', function() {
		subForm2('valid/rule/querylist');
	});
	$('#resetbutton').on('click', function() {
	      $("#ruleCode").val("");
	      $("#ruleName").val("");
	});
});
</script>
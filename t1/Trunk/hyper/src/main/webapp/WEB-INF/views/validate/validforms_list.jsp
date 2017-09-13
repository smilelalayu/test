<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!--[if !IE]><!-->
<div class="page-content">
	<div class="row">
	<div class="col-md-12">
	<h2 class="page-title">参数列表</h2>
	<div class="portlet light">
	    <div class="portlet-title">
			<div class="caption">查询条件</div>
		</div>
		<div class="portlet-body form">
			<!-- BEGIN FORM-->
			<form class="form-horizontal" id='searchForm' method="post">
			     <input name="actionCode" value="${validForms.actionCode}" type="hidden"/>
			     <input name="context" value="${validForms.context}" type="hidden"/>
			     <input name="postUrl" value="${validForms.postUrl}" type="hidden"/>
				<div class="form-body">
					<!--/row-->
					<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="control-label col-md-4">参数</label>
							<div class="col-md-8">
								<input type="text" name="type" id="type" class="form-control" value="${validForms.type }" placeholder="类型" />
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<button type="button" onclick="go('valid/param/add?actionCode=${validForms.actionCode}&context=${validForms.context}&postUrl=${validForms.postUrl}&version=${validForms.version}');"class="btn yellow-gold">
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
								<th>模块代码</th>
								<th>参数</th>
								<th>系统代码</th>
								<th>请求地址</th>
								<th>是否必填</th>
								<th>版本</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageReq.result}" var="mdl">
								<tr>
									<td>${mdl.id }</td>
									<td>${mdl.actionCode }</td>
									<td>${mdl.type }</td>
									<td>${validForms.context }</td>
									<td>${validForms.postUrl }</td>
									<td>
									
									<c:choose>
									  <c:when test="${mdl.formRulesJson.required == true }">
									      必填
									  </c:when>
									  <c:when test="${mdl.formRulesJson.requiredmsg == 'jsonIsError' }">
									         模块 rules值参数Json格式错误
									  </c:when>
									  <c:otherwise>
									       非必填
									  </c:otherwise>								
									</c:choose>
									
									</td>
									<td>${mdl.version }</td>
									<td>
									<a class="btn btn-xs blue" href="javascript:go('valid/param/update?id=${mdl.id}&actionCode=${validForms.actionCode}&context=${validForms.context}&postUrl=${validForms.postUrl}&version=${validForms.version}');"> 编辑</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<cn:page url="valid/param/querylist"	pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
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
		subForm2('valid/param/querylist');
	});
	$('#resetbutton').on('click', function() {
	      $("#ruleCode").val("");
	      $("#ruleName").val("");
	});
});
</script>
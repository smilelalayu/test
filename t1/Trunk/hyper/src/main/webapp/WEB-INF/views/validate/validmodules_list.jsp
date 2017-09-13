<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<!--[if !IE]><!-->
<div class="page-content">
	<div class="row">
	<div class="col-md-12">
	<h2 class="page-title">模块列表</h2>
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
								<label class="control-label col-md-4">模块名</label>
								<div class="col-md-8">
									<input type="text" name="modelName" id="modelName"class="form-control" value="${validModules.modelName }" placeholder="模块名" />
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label class="control-label col-md-4">模块代码</label>
								<div class="col-md-8">
									<input type="text" name="actionCode" id="actionCode"class="form-control" value="${validModules.actionCode }" placeholder="模块代码" />
								</div>
							</div>
						</div>
						
						
						<div class="col-md-4">
							<div class="form-group">
								<label class="col-md-4 control-label">系统代码</label>
								<div class="col-md-8">
									<select class="form-control" name="context" id="context">
									    <option value="">选项</option>
										<c:forEach items="${appMap}" var="app">		
										<c:choose>
										  <c:when test="${app.key  == validModules.context}">
										      <option value="${app.key }" selected="selected">${app.value}(${app.key })</option>
										  </c:when>
										  <c:otherwise>
										       <option value="${app.key }">${app.value}(${app.key })</option>
										  </c:otherwise>
										</c:choose>		
										</c:forEach>											
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label class="control-label col-md-4">请求地址</label>
								<div class="col-md-8">
									<input type="text" name="postUrl" id="postUrl"class="form-control" value="${validModules.postUrl }" placeholder="请求地址" />
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<button type="button" onclick="go('valid/module/add');"class="btn yellow-gold">
							新增
						</button>
					</div>
					<div class="col-md-6 text-right">
					        <button type="button" id="resetbutton"  class="btn btn-default"><i class="fa fa-refresh"></i>重置</button>
							<button type="button" id="formSubmit"  class="btn yellow-gold"><i class="fa fa-search"></i>查询</button>	
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
								<th>模块名</th>
								<th>模块代码</th>
								<th>系统代码</th>
								<th>版本</th>
								<th>权限页面</th>
								<th>请求地址</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageReq.result}" var="mdl">
								<tr>
									<td>${mdl.id }</td>
									<td>${mdl.modelName }</td>
									<td>${mdl.actionCode }</td>
									<td>${mdl.context }</td>
									<td>${mdl.version }</td>
									<td>${mdl.accessUrl }</td>
									<td>${mdl.postUrl }</td>
									<td>
									<a class="btn btn-xs yellow" href="javascript:go('valid/param/querylist?actionCode=${mdl.actionCode}&context=${mdl.context }&postUrl=${mdl.postUrl }&version=${mdl.version }');">参数</a>
									|
									<a class="btn btn-xs blue" href="javascript:go('valid/module/update?id=${mdl.id}');"> 编辑</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<cn:page url="valid/module/querylist"	pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
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
	$('#formSubmit').bind('click', function() {
		subForm2('valid/module/querylist');
	});
	$('#resetbutton').bind('click', function() {
	      $("#modelName").val("");
	      $("#actionCode").val("");
	      $("#postUrl").val("");
	});
</script>
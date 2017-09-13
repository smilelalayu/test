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
	<h2 class="page-title">白名单列表</h2>
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
						<div class="col-md-3">
							<div class="form-group">
								<label class="control-label col-md-4">白名单</label>
								<div class="col-md-8">
									<input type="text" name="ip" id="ip" class="form-control" value="${whiteIp.ip }" placeholder="请输入" />
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label class="col-md-4 control-label">系统代码</label>
								<div class="col-md-8">
									<select class="form-control" name="appCode" id="appCode">
									    <option value="">选项</option>
										<c:forEach items="${appMap}" var="app">		
										<c:choose>
										  <c:when test="${app.key  == whiteIp.appCode}">
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
						<div class="col-md-3">
							<div class="form-group">
								<label class="col-md-4 control-label">状态</label>
								<div class="col-md-8">
									<select class="form-control" name="status">	
											<c:choose>
											  <c:when test="${userChannel.status == 0 }">
											       <option value="0" selected="selected">正常</option>
											       <option value="1" >关闭</option>
											       <option value="">选项</option>
											  </c:when>
											  <c:when test="${userChannel.status == 1 }">
											       <option value="1" selected="selected">关闭</option>
											       <option value="0" >正常</option>
											       <option value="">选项</option>
											  </c:when>
											  <c:otherwise>
											       <option value="" selected="selected">选项</option>
											       <option value="0" >正常</option>	
											       <option value="1" >关闭</option>  
											  </c:otherwise>								
											</c:choose>
									</select>
								</div>
							</div>
					</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<button type="button" onclick="go('userauth/white/add');" class="btn yellow-gold">
							新增
						</button>
					</div>
					<div class="col-md-6 text-right">
					        <button type="button" id='resetbutton'  class="btn btn-default"><i class="fa fa-refresh"></i>重置</button>
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
								<th>白名单</th>
								<th>系统代码</th>
								<th>描述</th>
								<th>状态</th>
								<th>操作</th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageReq.result}" var="mdl" >
								<tr>
									<td>${mdl.id }</td>
									<td>${mdl.ip }</td>
									<td>${mdl.appCode }</td>
									<td>${mdl.description }</td>
									<td>
                                      <c:choose>
									  <c:when test="${mdl.status == 0 }">
									      正常
									  </c:when>
									  <c:otherwise>
									       关闭
									  </c:otherwise>								
									</c:choose>
									
									</td>
									<td><a class="btn btn-xs blue" href="javascript:go('userauth/white/update?id=${mdl.id}');"> 编辑</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<cn:page url="userauth/white/querylist" pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
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
		subForm2('userauth/white/querylist');
	});
	$('#resetbutton').on('click', function() {
	      $("#ip").val("");
	});
});
</script>
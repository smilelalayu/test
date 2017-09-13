<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="page-content">
	<h3 class="page-title">
	处理结果
	</h3>
	<div class="text-center" style="margin:60px;">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<span style="height:40px;line-height:40px;width:40px;text-align:center;display:inline-block;border:2px solid #26A69A;border-radius:50%;">
					<i class="fa fa-check text-success" style="font-size:23px;"></i>
				</span>
				<span class="text-success font-hg" style="vertical-align: middle;display:inline-block;margin-top:-10px;margin-left:10px;">提交成功！</span>
				<br><br>
				<div class="portlet-body text-center">
					<div class="panel">
						<div class="panel-body">
							${messageShow }
						</div>
					</div>
				</div>
				<div class="row margin-top-20">
					<div class="col-md-4 col-md-offset-4">
						<a href="<c:if test="${redirectURL == 'index' }">index</c:if><c:if test="${redirectURL != 'index' }">javascript:go('${redirectURL }');</c:if>" class="btn  green btn-block ">
							<i class="fa fa-mail-reply"></i>返回  
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

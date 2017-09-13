<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="page-content">
	<h3 class="page-title">
	处理结果
	</h3>
	<div class="text-center" style="margin:60px;">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<span style="height:40px;line-height:40px;width:40px;text-align:center;display:inline-block;border:2px solid #F3565D;border-radius:50%;">
					<i class="fa fa-times text-danger" style="font-size:23px;"></i>
				</span>
				<span class="text-danger font-hg" style="vertical-align: middle;display:inline-block;margin-top:-10px;margin-left:10px;">提交失败！</span>
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
						<a href="javascript:go('${redirectURL }');" class="btn  red btn-block ">
							<i class="fa fa-mail-reply"></i>返回  
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

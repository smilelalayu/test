<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>


<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">规则新增</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase"> 基本信息</span>
					</div>
				</div>
				<div class="portlet-body">
					<form action="" class="form-horizontal"  id="formSubmitToSys">
						<div class="form-body">
								<div class="row ">
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">规则代码<font color="red">*</font></label>		
											<div class="col-md-8">
												<input class="form-control" name = "ruleCode" id="ruleCode" placeholder="规则代码" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">规则名<font color="red">*</font></label>
											<div class="col-md-8">
												<input class="form-control" name = "ruleName" id="ruleName" placeholder="规则名" type="text">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">正则表达式</label>
											<div class="col-md-8">
												<input class="form-control" placeholder="正则表达式" type="text" name="expression" id="expression">
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">函数</label>
											<div class="col-md-8">
												<input class="form-control" placeholder="函数" type="text" name="function" id="function" >
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-4 control-label">公式</label>
											<div class="col-md-8">
												<input class="form-control" placeholder="公式" type="text" name="formula" id="formula" >
											</div>
										</div>
									</div>
								</div>
							</div>
					</form>
					<div class="row">
						<div class="col-md-6">
						</div>
						<div class="col-md-6 text-right">
							<button class="btn grey" id='resetbutton'><i class="icon-refresh"></i> 重置</button>
							<button class="btn yellow-gold" id="formSubmit"><i class="icon-check"></i> 提交</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- END CONTENT -->
	
<script type="text/javascript">
	$('#formSubmit').on('click', function() {
		
		var ruleCode = $("#ruleCode").val();
		if(ruleCode.trim()==""){
			JfchUi.alert({content:'规则代码不能为空 ！'})
			return;
		}
		var ruleName = $("#ruleName").val();
		if(ruleName.trim()==""){
			JfchUi.alert({content:'规则名不能为空 ！'})
			return;
		}
		subForm2('valid/rule/addSubmit','formSubmitToSys');
	});
	$('#resetbutton').on('click', function() {
	      $("#ruleCode").val("");
	      $("#ruleName").val("");
	      $("#expression").val("");
	      $("#function").val("");
	      $("#formula").val("");
	});
</script>
	
	
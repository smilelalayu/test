<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>
<link href="${publicPath}/assets/global/plugins/icheck/skins/all.css" rel="stylesheet"/>
<style>
	.icheckbox_line-grey, .iradio_line-grey{background: #c6c2bc;}
	.icheckbox_line-grey.checked, .iradio_line-grey.checked{background: #333;}
</style>
<<!-- BEGIN CONTENT -->
		<div class="color-line"></div>
		<div class="page-content">
			<h1 class="page-title">参数编辑</h1>
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-speech"></i>
						<span class="caption-subject bold uppercase">基本信息</span>
					</div>
				</div>
				<div class="portlet-body">
					<form action="" class="form-horizontal" id="formSubmitToSys">
					     <input name="version" value="${validForms.version}" type="hidden"/>
					     <input  name="id" value="${validForms.id}" type="hidden" />
						<div class="form-body">
							<div style="border: 1px solid #e1e1e1;margin-bottom: 20px;">

								<div style="padding: 5px 10px;background: #f6f6f6;font-size: 14px;border-bottom: 1px solid #e1e1e1;">模块信息</div>
								<div style="padding: 15px;">
									<div class="row">
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">系统代码</label>
												<div class="col-md-7">
													<input type="text" readonly="readonly" class="form-control" name="context" id= "context" value="${validFormsParam.context }">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">模块代码</label>
												<div class="col-md-7">
													<input type="text" readonly="readonly" class="form-control" name="actionCode" id= "actionCode"  value="${validFormsParam.actionCode }">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">请求地址</label>
												<div class="col-md-7">
													<input type="text" readonly="readonly" class="form-control" name="postUrl" id= "postUrl"  value="${validFormsParam.postUrl }">
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div style="border: 1px solid #e1e1e1;margin-bottom: 20px;">
								<div style="padding: 5px 10px;background: #f6f6f6;font-size: 14px;border-bottom: 1px solid #e1e1e1;">参数信息</div>
								<div style="padding: 15px;">
								
									<div class="row">
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">参数<font color="red">*</font></label>
												<div class="col-md-7">
													<input type="text" class="form-control" readonly="readonly" value="${validForms.type }">
												</div>
											</div>
										</div>
							    </div>
							    <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
								<div class="row">	    
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">是否必填</label>
												<div class="col-md-7">
													<select class="form-control" name="formRulesJson.required">
														<c:choose>
														  <c:when test="${validForms.formRulesJson.required == true }">
														      <option value="false">非必填</option>
															  <option value="true" selected="selected">必填</option>
														  </c:when>
														  <c:otherwise>
														      <option value="false" selected="selected">非必填</option>
															  <option value="true">必填</option>
														  </c:otherwise>								
														</c:choose>
													</select>
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">必填MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.requiredmsg }" class="form-control" name="formRulesJson.requiredmsg" id= "requiredmsg">
												</div>
											</div>
										</div>
							      </div>
							      </div>
							      <div class="row">			
									<div class="col-md-4">
										<div class="form-group">
											<label class="col-md-5 control-label">正则表达式MSG</label>
											<div class="col-md-7">
												<input type="text" value="${validForms.formRulesJson.expressionmsg }" class="form-control" name="formRulesJson.expressionmsg" id= "expressionmsg">
											</div>
										</div>
									</div>
						        </div>
						           <div class="row">				
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">函数MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.functionmsg }" class="form-control" name="formRulesJson.functionmsg" id= "functionmsg">
												</div>
											</div>
										</div>
					            	</div>
							       <div class="row">			
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">公式MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.formulamsg }" class="form-control" name="formRulesJson.formulamsg" id= "formulamsg">
												</div>
											</div>
										</div>
										
					            </div>
					     <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
							<div class="row">								
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">是否数字</label>
												<div class="col-md-7">
													<select class="form-control" name="formRulesJson.number">						
														<c:choose>
														  <c:when test="${validForms.formRulesJson.number == true }">
														      <option value="false">否</option>
														      <option value="true" selected="selected">是</option>
														  </c:when>
														  <c:otherwise>
														      <option value="false" selected="selected">否</option>
														      <option value="true">是</option>
														  </c:otherwise>								
														</c:choose>	
													</select>
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">是否数字MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.numbermsg }" class="form-control" name="formRulesJson.numbermsg" id= "numbermsg">
												</div>
											</div>
										</div>
										
							</div>
							</div>
								 <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
								<div class="row">					
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">是否整数</label>
												<div class="col-md-7">
													<select class="form-control" name="formRulesJson.digits">
													    <c:choose>
														  <c:when test="${validForms.formRulesJson.digits == true }">
														      <option value="false">否</option>
														      <option value="true" selected="selected">是</option>
														  </c:when>
														  <c:otherwise>
														      <option value="false" selected="selected">否</option>
														      <option value="true">是</option>
														  </c:otherwise>								
														</c:choose>
													</select>
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">是否整数MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.digitsmsg }" class="form-control" name="formRulesJson.digitsmsg" id= "digitsmsg">
												</div>
											</div>
										</div>
								</div>
								</div>
					            <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
						    	  <div class="row">				
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框长度最小值</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.minlength }" class="form-control" name="formRulesJson.minlength" id= "minlength">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框长度最小值MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.minlengthmsg }" class="form-control" name="formRulesJson.minlengthmsg" id= "minlengthmsg">
												</div>
											</div>
										</div>
							     	</div>
							     </div>
							       <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
							       <div class="row">					
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框长度最大值</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.maxlength }" class="form-control" name="formRulesJson.maxlength" id= "maxlength">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框长度最大值MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.maxlengthmsg }" class="form-control" name="formRulesJson.maxlengthmsg" id= "maxlengthmsg">
												</div>
											</div>
										</div>
					              </div>
					              </div>
					                <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
					                   <div class="row">					
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框不能小于值</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.min }" class="form-control" name="formRulesJson.min" id= "min">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框不能小于值MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.minmsg }" class="form-control" name="formRulesJson.minmsg" id= "minmsg">
												</div>
											</div>
										</div>
					              </div>
					              </div>
					             <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
							        <div class="row">					
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框不能大于值</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.max }" class="form-control" name="formRulesJson.max" id= "max">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入框不能大于值MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.maxmsg }" class="form-control" name="formRulesJson.maxmsg" id= "maxmsg">
												</div>
											</div>
										</div>
					             </div>
					             </div>
					              <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
							      <div class="row">					
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">remote</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.remote }" class="form-control" name="formRulesJson.remote" id= "remote">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">remotemsg的MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.remotemsg }" class="form-control" name="formRulesJson.remotemsg" id= "remotemsg">
												</div>
											</div>
										</div>
					               </div>
					               </div>
					               <div style="border: 1px solid #ddd;padding-top: 10px;margin-bottom: 10px;background: #fcfcfc;">
							        <div class="row">					
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入值必须和#field相同</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.equalTo }" class="form-control" name="formRulesJson.equalTo" id= "equalTo">
												</div>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label class="col-md-5 control-label">输入值必须和#field相同MSG</label>
												<div class="col-md-7">
													<input type="text" value="${validForms.formRulesJson.equalTomsg }" class="form-control" name="formRulesJson.equalTomsg" id= "equalTomsg">
												</div>
											</div>
										</div>
									</div>
									</div>
								</div>
							</div>
							<div style="border: 1px solid #e1e1e1;margin-bottom: 20px;">


                            <div style="border: 1px solid #e1e1e1;margin-bottom: 20px;">

								<div style="padding: 5px 10px;background: #f6f6f6;font-size: 14px;border-bottom: 1px solid #e1e1e1;">规则选择</div>
								<div style="padding: 15px;">
									<div class="input-group">
										<div class="icheck-inline">			
										<c:forEach items="${validRulesList}" var="mdl">
											<label class="radio-inline">
												<c:choose>
													  <c:when test="${validForms.ruleId == mdl.id }">
							                             	<input type="radio" name="ruleId" class="icheck" value="${mdl.id} " checked="checked" data-radio="iradio_line-grey" data-label="${mdl.ruleName }(${mdl.ruleCode })"/>
													  </c:when>
													  <c:otherwise>
													       <input type="radio" name="ruleId" class="icheck" value="${mdl.id} " data-radio="iradio_line-grey" data-label="${mdl.ruleName }(${mdl.ruleCode })"/>
													  </c:otherwise>								
												</c:choose>	
											</label>
										</c:forEach>
										</div>
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
							<button class="btn grey" id="resetbutton"><i class="icon-refresh"></i> 重置</button>
							<button class="btn yellow-gold" id="formSubmit"><i class="icon-check"></i> 提交</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- END CONTENT -->
	<script type="text/javascript">
	$('#formSubmit').on('click', function() {
		    var ex = /^\d+$/; 
	        var minlength = $("#minlength").val();
	        if (minlength!="") {
	           // 则为整数
	           if(!ex.test(minlength)){
	        	   JfchUi.alert({content:'输入框长度最小值请输入整数！'})
	   			  return;
	           }
	        }
	        var maxlength = $("#maxlength").val();
	        if (maxlength!="") {
	           // 则为整数
	           if(!ex.test(maxlength)){
	        	   JfchUi.alert({content:'输入框长度最大值请输入整数！'})
	   			  return;
	           }
	        }
	        var min = $("#min").val();
	        if (min!="") {
	           // 则为整数
	           if(!ex.test(min)){
	        	   JfchUi.alert({content:'输入框不能小于值 请输入整数！'})
	   			  return;
	           }
	        }
	        var max = $("#max").val();
	        if (max!="") {
	           // 则为整数
	           if(!ex.test(max)){
	        	   JfchUi.alert({content:'输入框不能大于值 请输入整数！'})
	   			  return;
	           }
	        }
		subForm2('valid/param/updateSubmit','formSubmitToSys');
	});
	$('#resetbutton').on('click', function() {
	      $("#requiredmsg").val("");
	      $("#expressionmsg").val("");
	      $("#functionmsg").val("");
	      $("#formulamsg").val("");
	      $("#numbermsg").val("");
	      $("#digitsmsg").val("");
	      $("#minlengthmsg").val("");      
	      $("#maxlengthmsg").val("");
	      $("#minmsg").val("");
	      $("#maxmsg").val("");
	      $("#remotemsg").val("");
	      $("#equalTomsg").val("");
	});
</script>
	
	
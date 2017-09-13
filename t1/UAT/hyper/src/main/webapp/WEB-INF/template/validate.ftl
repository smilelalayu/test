<script>
var FormValidation = function() {
	var handleValidation = function() {
		$("form").each(function() {
			var form = $(this);
			var rules = {};
			var messages = {};
			var inputRules = {};
			var inputMessages = {};
			<#if roles?? && roles?size!=0>
			<#list roles as one>
			<#assign m=one.metaData>
			if(form.find("input[name='${one.type}']")){
				<#if m.required?? && m.required>
				inputRules["required"] = true;
				inputMessages["required"] = "${m.requiredmsg}";
				</#if>
				<#if m.number?? && m.number>
				inputRules["number"] = true;
				inputMessages["number"] = "${m.numbermsg}";
				</#if>
				<#if m.digits?? && m.digits>
				inputRules["digits"] = true;
				inputMessages["digits"] = "${m.digitsmsg}";
				</#if>
				<#if m.minlength?? && m.minlength!=0>
				inputRules["minlength"] = ${m.minlength};
				inputMessages["minlength"] = "${m.minlengthmsg}";
				</#if>
				<#if m.maxlength?? && m.maxlength!=0>
				inputRules["maxlength"] = ${m.maxlength};
				inputMessages["maxlength"] = "${m.maxlengthmsg}";
				</#if>
				<#if m.min?? && m.min!=0>
				inputRules["min"] = ${m.min};
				inputMessages["min"] = "${m.minmsg}";
				</#if>
				<#if m.max?? && m.max!=0>
				inputRules["max"] = ${m.max};
				inputMessages["max"] = "${m.maxmsg}";
				</#if>
				<#if m.remote?? && m.remote!="">
				inputRules["remote"] = "${m.remote}";
				inputMessages["remote"] = "${m.remotemsg}";
				</#if>
				<#if m.equalTo?? && m.equalTo!="">
				if($('${m.equalTo}').length>0){
					inputRules["equalTo"] = "${m.equalTo}";
					inputMessages["equalTo"] = "${m.equalTomsg}";
				}
				</#if>
				<#if one.expression?? && one.expression!="">
				$.validator.addMethod("expression_${one.type}", function(value, element) {
					var patt = new RegExp("${one.expression}");
					var isExp = patt.test(value);
					return isExp;
				}, "${m.expressionmsg}");
				inputRules["expression_${one.type}"]=true;
				</#if>
				<#if one.formula?? && one.formula!="">
				$.validator.addMethod("formula_${one.type}", function( value, element) {
					var formula='${one.formula}';
					var flag = false;
					var tags=formula.match(/(?=[\#|\.]).*?(?=[\'|\"]\))/g);
					if(tags){
						for(var i=0;i<tags.length;i++){
							var t=tags[i];
							if(t){
								var target=$(t);
								var tValue=target.val();
								if(!tValue){
									tValue=null;
								}else if(typeof(tValue) == "number"){
									tValue=Number(tValue);
								}else if(typeof(tValue) == "Boolean"){
									tValue=Boolean(tValue);
								}else if(typeof(tValue) == "string"){
									tValue=String(tValue);
								}
								var regx=RegExp("\\\$\\([\\\'|\\\"](" + t + ")[\\\'|\\\"]\\)", "g");
								formula=formula.replace(regx,tValue);
								if (this.settings.onfocusout){
									target.unbind(".validate-equalTo").bind("blur.validate-equalTo",function(){
										$( element ).valid();
									});
								}
							}
						}
					}
					flag=eval(formula);
					return flag;
				}, "${m.formulamsg}");
				inputRules["formula_${one.type}"]=true;
				</#if>
				
				rules["${one.type}"] = inputRules;
				messages["${one.type}"] = inputMessages;
				
				inputRules = {};
				inputMessages = {};
			}
			</#list>
			</#if>
					
			form.validate({
				errorElement : "span",
				errorClass : "help-block help-block-error",
				focusInvalid : false,
				ignore : "",
				messages : messages,
				rules : rules,
				highlight : function(element) {$(element).closest(".form-group").addClass("has-error");},
				unhighlight : function(element) {$(element).closest(".form-group").removeClass("has-error");},
				success : function(label) {label.closest(".form-group").removeClass("has-error");},
				<#if asyn>
				submitHandler:function() {subForm(form.attr("action"),form.attr("id"));}
				</#if>
			});
		});
	};
	
	return {
		init : function() {
			handleValidation();
		}
	};
}();
			
$(function(){
	FormValidation.init();
});
</script>
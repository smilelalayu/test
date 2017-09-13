<%@tag pageEncoding="UTF-8"%>
<%@attribute name="status" type="java.lang.String" required="true"%>
<%@attribute name="message" type="java.lang.String" required="true"%>
<div class="alert alert-danger display-hide">
	<button class="close" data-close="alert"></button>
	<input type="hidden" id="returnMessaStatus" value="${status }" />
	<div id="errorMsg">${message }</div>
</div>

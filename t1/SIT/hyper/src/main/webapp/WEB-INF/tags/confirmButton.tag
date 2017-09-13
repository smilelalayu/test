<%@tag pageEncoding="UTF-8" %>
<%@attribute name="message" type="java.lang.String" required="true" %>
<%@attribute name="content" type="java.lang.String" required="false" %>
<%@attribute name="fn" type="java.lang.String" required="true" %>
<div id="confirmMask" class="modal fade" tabindex="-1" data-backdrop="static" data-keyboard="false" data-attention-animation="false">
	<div class="modal-header">
		<button type="button" data-dismiss="modal" class="close"></button>
		<div class="modal-title">
			<span id="confirmMaskMsg">
				${message }
			</span>
		</div>
	</div>
	<div  class="modal-body">
		<span id="confirmMaskContent">
				${content }
		</span>
	</div>
	<div class="modal-footer">
		<button type="button" onclick="${fn }" data-dismiss="modal" class="btn yellow-gold">确定</button>
		<button type="button" id="hideSubmitBtn" data-target="#confirmMask" data-toggle="modal" style="display: none"/>
		<button type="button" data-dismiss="modal" class="btn btn-default">取消</button>
	</div>
</div>	


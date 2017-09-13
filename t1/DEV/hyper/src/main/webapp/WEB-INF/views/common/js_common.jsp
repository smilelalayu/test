<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!-- 与项目中的JQ冲突 暂时屏蔽 -->
<script src="${publicPath}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${publicPath}/assets/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/jquery-validation/js/localization/messages_zh.min.js" type="text/javascript" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/jquery-validation/js/additional-methods.min.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/select2/select2.min.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-wysihtml5/wysihtml5-0.3.0.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-timepicker/js/bootstrap-timepicker.min.js"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-daterangepicker/moment.min.js"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" type="text/javascript"></script>

<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL STYLES -->

<script src="${publicPath}/assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="${publicPath}/assets/admin/layout/scripts/mydemo.js" type="text/javascript"></script>
<script src="${publicPath}/assets/admin/pages/scripts/components-pickers.js"></script>

<script src="${publicPath}/assets/global/plugins/bootstrap-modal/js/bootstrap-modalmanager.js" type="text/javascript"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-modal/js/bootstrap-modal.js" type="text/javascript"></script>

<script src="${appPath}/js/layout.js" type="text/javascript"></script>
<script src="${publicPath}/assets/admin/pages/scripts/ui-extended-modals.js"></script>

<script src="${appPath}/js/commonPage.js"></script>
<script src="${appPath}/js/fileUpload.js"></script>

<!-- FILEINPUT -->
<script src="${publicPath}/assets/global/plugins/bootstrap-fileinput/fileinput.js"></script>
<script src="${publicPath}/assets/global/plugins/bootstrap-fileinput/fileinput_locale_zh.js"></script>
<script src="${publicPath}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>

<!-- SLIMSCROLL -->
<script src="${publicPath}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>

<!-- SELECT -->
<script type="text/javascript" src="${publicPath}/assets/global/plugins/bootstrap-select/bootstrap-select.min.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/jquery-multi-select/js/jquery.multi-select.js"></script>

<!-- WIZARD -->
<script src="${publicPath}/assets/admin/pages/scripts/form-wizard.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>

<!-- TABLE -->
<script type="text/javascript" src="${publicPath}/assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/datatables/extensions/TableTools/js/dataTables.tableTools.min.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/datatables/extensions/ColReorder/js/dataTables.colReorder.min.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/datatables/extensions/Scroller/js/dataTables.scroller.min.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>

<script type="text/javascript" src="${publicPath}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>

<script type="text/javascript" src="${publicPath}/assets/global/scripts/common.extend.js"></script>

<script type="text/javascript" src="${publicPath}/assets/global/scripts/JfchUi.js"></script>
<script type="text/javascript" src="${publicPath}/assets/global/plugins/icheck/icheck.js"></script>


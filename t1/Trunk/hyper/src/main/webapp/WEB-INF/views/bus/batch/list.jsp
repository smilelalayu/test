<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/base.tld" prefix="cn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="cntags" tagdir="/WEB-INF/tags"%>

<div class="page-content">
	<cntags:confirmButton fn="uploadFile();" content="确认导入工单？" message="注意"></cntags:confirmButton>

	<div class="row">
		<div class="col-md-12">
			<h2 class="page-title">批次管理</h2>
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
										<label class="control-label col-md-4">推BUS批次号</label>
										<div class="col-md-8">
											<input type="text" name="batchNO" id="batchNO" value="${batch.batchNO}" class="form-control" placeholder="推BUS批次号" />
										</div>
									</div>
								</div>
								<div class="col-md-5">
									<div class="form-group">
										<label class="col-md-4 control-label">发送BUS日期</label>
										<div class="col-md-8">
											<div class="input-group date-picker input-daterange">
												<input type="text" name="beginDate" id="beginDate" value="<fmt:formatDate value="${batch.beginDate}" type="both" pattern="yyyy/MM/dd" />" class="form-control date-picker" placeholder="起始日期" />
												<span class="input-group-addon">to </span>
												<input type="text" name="endDate" id="endDate" value="<fmt:formatDate value="${batch.endDate}" type="both" pattern="yyyy/MM/dd" />" class="form-control date-picker" placeholder="结束日期" />
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<a id="btnDownload" class="btn yellow-saffron">
									<i class="fa fa-upload"> </i>
									导入推BUS批次
								</a>
								<c:if test="${butSwitch == 'Y'}">
									<c:if test="${dbl2blSwitch != 'Y'}">
										<a id="openbutSwitch" class="btn blue">
											<i class="fa fa-power-off"> </i>
											开启POS贷反保理转保理								
										</a>
									</c:if>
									<c:if test="${dbl2blSwitch == 'Y'}">
										<a id="closebutSwitch" class="btn red">
											<i class="fa fa-power-off"> </i>
											关闭POS贷反保理转保理											
										</a>
									</c:if>
								</c:if>
								
								
							</div>
							<div class="col-md-6 text-right">
								<button type="button" onclick="subForm2('bus/batch/querylist');" id="queryForm" class="btn yellow-gold">
									<i class="fa fa-search"> 查询 </i>
								</button>
								<button type="button" id='resetbutton' class="btn btn-default">
									<i class="fa fa-refresh"> 重置 </i>
								</button>
							</div>
						</div>

					</form>
					<!-- END FORM-->
				</div>
			</div>
			<!-- BEGIN PAGE CONTENT-->
			<c:if test="${pageReq.totalCount != null }">
			<div class="row">
				<div class="col-md-12">
					<div class="portlet light">
						<div class="portlet-title">
							<div class="caption">查询结果</div>
						</div>
						<div class="portlet-body">
							<table class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<th>推BUS批次号</th>
										<th>文件名</th>
										<th>申请时间</th>
										<th>开始推送时间</th>
										<th>完成推送时间</th>
										<th>BUS总数</th>
										<th>成功数量</th>
										<th>失败数量</th>
										<th>未推数量</th>
										<th>上传人</th>
										<th>上传时间</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${empty pageReq.result }">
										<tr>
											<td colspan="11" style="text-align: center;">没有数据</td>
										</tr>
									</c:if>
									<c:forEach items="${pageReq.result}" var="bat" varStatus="vsNo">
										<tr>
											<td>${bat.batchNO}</td>
											<td>
												<a class="btnDownloadFile" onclick="doDownLoad('${bat.batchNO}');" data-batchno="${bat.batchNO}" style="color: blue;" target="_self">${bat.fileName}</a>
											</td>
											<td>
												<fmt:formatDate value="${bat.appayDate}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
											</td>
											<td>
												<fmt:formatDate value="${bat.beginDate}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
											</td>
											<td>
												<fmt:formatDate value="${bat.endDate}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
											</td>
											<td>${bat.total}</td>
											<td>${bat.totalSuccess}</td>
											<td>${bat.totalFail}</td>
											<td>${bat.totalUnsent}</td>
											<td>${bat.updateUserName}</td>
											<td>
												<fmt:formatDate value="${bat.updateTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
											</td>
											<td>
												<c:choose>
													<c:when test="${bat.sentToBus == false && redisSize == 0 && bat.totalUnsent>0}">
														<a class="btnImportFail btn btn-xs blue" data-batchno="${bat.batchNO}" >发送至BUS</a>
													</c:when>
													<c:when test="${bat.sentToBus == false && redisSize > 0 && bat.totalUnsent>0}">
														<a class="btnImportFail btn btn-xs blue" data-batchno="${bat.batchNO}" >发送至BUS</a>
													</c:when>
													<c:when test="${bat.sentToBus == true && redisSize > 0 && bat.totalUnsent>0}">
														<a class="btnImportFail btn btn-xs blue" data-batchno="${bat.batchNO}" >发送至BUS</a>
													</c:when>
													<c:when test="${bat.sentToBus == true && redisSize == 0 && bat.totalUnsent>0}">
														<a class="btnImportFail btn btn-xs blue" data-batchno="${bat.batchNO}" >发送至BUS</a>
													</c:when>

													<%-- 
													<c:when test="${bat.sentToBus == false && bat.total != 0 && bat.totalSuccess == 0 && bat.totalFail == 0}">
														<a class="btnImportFail" data-batchno="${bat.batchNO}" style="color: blue;">发送至BUS</a>
													</c:when>
													<c:when test="${bat.sentToBus == false && bat.total != 0 && bat.totalUnsent>0}">
														<a class="btnImportFail" data-batchno="${bat.batchNO}" style="color: blue;">发送至BUS</a>
													</c:when>
													<c:when test="${bat.sentToBus == true && bat.total != 0 && bat.totalSuccess == 0 && bat.totalFail == 0 && bat.totalFail > 0}">
														当前批次正在推BUS
													</c:when> --%>
												</c:choose>
											</td>
									</c:forEach>
								</tbody>
							</table>
							<cn:page url="bus/batch/querylist.gxtweb" pageSize="${pageReq.pageSize}" totalCount="${pageReq.totalCount}" pageNo="${pageReq.pageNo}" />
						</div>
					</div>
				</div>
			</div>
			<!-- END PAGE CONTENT-->
			</c:if>
		</div>
	</div>


	<div class="modal fade" id="impFileModel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span>
					<span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title">导入推BUS批次</h4>
			</div>
			<div class="modal-body">
				<!-- 你的代码，取portlet-body中的代码放这里来就好 -->
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="#" id="subForm" class="form-horizontal" method="post" enctype="multipart/form-data">
						<div class="form-body">
							<!--/row-->
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<label for="appFile" class="col-md-4 control-label"><span class="font-red">*</span> 请选择导入文件 </label>
										<div class="col-md-8 form-group">
											<input id="appFile" type="file" multiple class="file" data-overwrite-initial="false" data-min-file-count="1">
											<div id="errorMsg" class="help-block"></div>
											<p class="help-block">文件格式必须是XLS或XLSX格式.</p>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-11">
									<div class="form-group">
										<label for="_token" class="col-md-4 control-label"><span class="font-red">*</span> 操作口令 </label>
										<div class="col-md-5">
											<input type="text" onfocus="this.type='password'" name="token" id="_token" class="form-control" autocomplete="off">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-11">
									<div class="form-group">
										<label for="_token" class="col-md-4 control-label"> 申请时间 </label>
										<div class="col-md-6">
											<input type="text" name="appayDate" id="appayDate" value="<fmt:formatDate value="${appayDate}" type="both" pattern="yyyy/MM/dd" />" class="form-control datetimepicker"  />
										</div>
									</div>
								</div>
							</div>
						</div>
					</form>
					<!-- END FORM-->
				</div>
				<!-- end -->
			</div>
			<div class="modal-footer">
				<a id="resetBtn" href="javascript:;" class="btn btn-default ">
					<i class="fa fa-refresh"> </i>
					重置
				</a>
				<a id="submitBtn" name="submitBtn" href="javascript:void(0);" class="btn  yellow-gold">
					<i class="fa fa-check"> </i>
					提交
				</a>
			</div>
			<div class="row" id="result_contain">
				<div class="col-md-12">
					<div class="portlet-body">
						<div id="panel" class="panel panel-success" style="margin: 15px;">
							<div class="panel-heading">
								<i id="title_icon" class="fa-lg fa fa-times"></i>
								&nbsp;&nbsp;
								<span id="result_title" class="control-label"></span>
							</div>
							<div class="panel-body">
								<span id="result_message" class="control-label"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<form id="form1" name="form1" action="" method="post">
		<input type="hidden" id="doType" name="doType" value="">
	</form>
	<!-- 确认批量推BUS提醒 -->
	<div id="isBatchImp" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title"></h4>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn  yellow-gold" data-dismiss="modal" id="isBatchImpConfirm">确认</button>
				<button data-bb-handler="cancel" type="button" class="btn  btn-default" data-dismiss="modal" aria-label="Close" id="isBatchImpCancel">取消</button>

			</div>
		</div>
	</div>

	<!-- 提醒 -->
	<div id="msg" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title"></h4>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn yellow-gold" data-dismiss="modal" id="msgConfirm">确认</button>
			</div>
		</div>
	</div>
	
	<!-- 确认批量推BUS提醒 -->
	<div id="butSwitchModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title"></h4>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button data-bb-handler="confirm" type="button" class="btn  yellow-gold" data-dismiss="modal" id="butSwitchConfirm">确认</button>
				<button data-bb-handler="cancel" type="button" class="btn  btn-default" data-dismiss="modal" aria-label="Close" id="isBatchImpCancel">取消</button>

			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	function doDownLoad(batchNO) {
		var $form = $("form")[2];
		$form.action = "bus/file/download.gxtweb?BatchNO=" + batchNO;
		$form.submit();
	}
</script>
<script type="text/javascript">
	$(function() {
		$('#btnDownload').on('click', function() {
			var $form = $("form")[1];
			var $resetBtn = $("a[id=resetBtn]");
			//重置
			$resetBtn.bind("click", function() {
				$('#appFile').val('');
				$('#_token').val('');
				$('#appayDate').val('');
				$form.reset();
			});
			//点击导入重置页面
			$("#resetBtn").click();
			$('#impFileModel').modal();

			$('#result_contain').hide();
			initFileInput('bus/file/imp');
			$('#appayDate').datetimepicker({
				   format: "yyyy/mm/dd hh:ii:ss",
				   autoclose:true
				});

		});
		
		$('#submitBtn').on('click', function() {
			showConfirmMask();
		});
		$('#msgConfirm').on('click', function() {
			$("#queryForm").click();
		});
		$('#resetbutton').click(
				function() {
					$(':input', '#searchForm').not(
							':button, :submit, :reset, :hidden').val('')
							.removeAttr('checked').removeAttr('selected')
							.trigger("change");
				});
		//初始化关联时间控件
		initLinkedDatepicker('beginDate', 'endDate');
		//查询时间初始化
		initQueryTime();
		$('.btnImportFail').on('click', function() {
			$("#isBatchImpConfirm").val($(this).data("batchno"));
			var title = '注意';
			var content = '<p>是否将此批工单发送至BUS？</p>';
			showModal("isBatchImp", title, content);
		});

		/* 		//下载
		 $('.btnDownloadFile').on('click', function() {
		 var no = $(this).data("batchno");
		 $.ajax({
		 type : "GET",
		 dataType : "json",
		 url : "bus/file/download.gxtweb",
		 data : "BatchNO=" + no,
		 success : function(data) {
		 alert(data);
		 alert('成功');
		 var title = '成功';
		 showModal("msg", title, data.message);
		 },
		 error : function(data) {
		 alert(data);
		 alert('失败');
		 var title = '失败';
		 showModal("msg", title, data.message);
		 }
		 })

		 var title = '注意';
		 var content = '<p>是否将此批工单发送至BUS？</p>';
		 }); */
		//批次推BUS方法
		$('#isBatchImpConfirm').on('click', function() {
			var batchNO = $("#isBatchImpConfirm").val();
			if (batchNO) {
				$.ajax({
					type : "POST",
					dataType : "json",
					async : false,
					url : "bus/app/batchImp",
					data : {
						batchNO : batchNO
					},
					success : function(data) {
						if (data.status) {
							var title = '成功';
							showModal("msg", title, data.message);
						} else {
							var title = '失败';
							showModal("msg", title, data.message);
						}
					},
					error : function(data) {
						var title = '失败';
						showModal("msg", title, data.message);
					}
				})
			}
		});
	});
	var uploadFile = function() {
		$('#appFile').fileinput('upload');
	};
	
	$('#openbutSwitch').on('click', function() {
		var title = '开启';
		var content = '<p>是否开启 [POS贷反保理转保理] 控制开关？</p>';
		showModal("butSwitchModal", title, content);
		$('#butSwitchConfirm').one('click', function() {
			butSwitchConfirm('Y');
			$('#butSwitch').removeclass('disabled');
		});
	});
	$('#closebutSwitch').on('click', function() {
		var title = '关闭';
		var content = '<p>是否关闭 [POS贷反保理转保理] 控制开关？</p>';
		showModal("butSwitchModal", title, content);
		$('#butSwitchConfirm').one('click', function() {
			butSwitchConfirm('N');
			$('#butSwitch').addClass('disabled');
		});
	});
	var butSwitchConfirm = function(isw) {
		$.ajax({
			type : "POST",
			url : "bus/batch/controlSwitch",
			data : "isSwitch="+isw,
			async : false,
			success : function(data) {
				if (data.status) {
					var title = '成功';
					showModal("msg", title, data.message);
				} else {
					var title = '失败';
					showModal("msg", title, data.message);
				}
			},
			error : function(data) {
				var title = '失败';
				showModal("msg", title, data.message);
			}
		});
	};
	
	
	/**
	 * 初始化查询时间
	 */
	function initQueryTime() {
		var initQueryTime = $("#initQueryTime").val();
		if ("true" == initQueryTime) {
			var date = new Date();
			var y = date.getFullYear();
			var m = date.getMonth() + 1;
			var d = date.getDate();

			if (parseInt(m) < 10) {
				m = "0" + m;
			}
			if (parseInt(d) < 10) {
				d = "0" + d;
			}
			var now = y + "/" + m + "/" + d;
			$("#beginDate").val(now);
			$("#endDate").val(now);
		}
	};
	function initFileInput(url) {
		$("#appFile").fileinput(
				{
					uploadUrl : url,
					cache : false,
					allowedFileExtensions : [ 'xls', 'xlsx' ],
					overwriteInitial : false,
					'showPreview' : false,
					uploadAsync : false,
					showRemove : false,
					showUpload : false,
					language : 'zh',
					minFileCount : 0,
					maxFileCount : 1,
					uploadExtraData : function() {
						return {
							'orgAppState' : $('#_orgAppState').find(
									"option:selected").val(),
							'destAppState' : $('#_destAppState').find(
									"option:selected").val(),
							'token' : $('#_token').val(),
							'appayDate' : $('#appayDate').val()
						};
					},
					'elErrorContainer' : '#errorMsg'
				});
		$("#appFile").on('filebatchuploadsuccess',
				function(event, data, previewId, index) {
					if (data.response.status == true) {
						$('#result_title').html('提交成功');
						$('#panel').attr('class', "panel panel-success");
						$('#title_icon').attr('class', "fa-lg fa fa-check");
						$('#impFileModel').on('hidden.bs.modal', function(e) {
							$("#queryForm").click();

						})
					} else {
						$('#result_title').html('提交失败');
						$('#panel').attr('class', "panel panel-danger");
						$('#title_icon').attr('class', "fa-lg fa fa-times");
					}
					$('#result_message').html(data.response.message);
					$('#result_contain').show();
					//清空表单
					var $form = $("form")[1];
					$('#appFile').val('');
					$('#_token').val('');
					$('#appayDate').val('');
					$form.reset();
				});
		$('#appFile').on('filebatchuploaderror',
				function(event, data, previewId, index) {
					$('#result_title').html('提交失败');
					$('#result_message').html(data.response.message);
					$('#result_contain').show();
				});

		
		
	}
</script>
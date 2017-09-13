function logout() {
	$(window).unbind('beforeunload');
	window.location.href = "logout";
}

function initLogin() {
	window.location.href = "initLogin";
}

function logoutCheck(url) {
	$.ajax({
		type : "GET",
		url : url,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		cache : false,
		async : false,
		error : function(request) {
		},
		success : function(data) {
		}
	});
}

function isLogout() {
	var title = '注意';
	var content = '<p>是否现在退出系统？</p>';
	showModal("isLogoutModal", title, content);
}

function index() {
	goSync("page/index");
}
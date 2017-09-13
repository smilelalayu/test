var myTableX = $('.table-x');

myTableX.dataTable({
    "bFilter": false, //搜索栏
    "bInfo": false, //显示表格信息
    "bSort": false, //是否支持排序功能
    "bPaginate": false, //是否显示分页
    "bLengthChange": false,  //每页显示的记录数
});
myTableX.find('.group-checkable').change(function () {
    var set = $(this).attr("data-set");
    var checked = $(this).is(":checked");
    $(set).each(function () {
        if (checked) {
            $(this).attr("checked", true);
        } else {
            $(this).attr("checked", false);
        }
    });
    $.uniform.update(set);
});

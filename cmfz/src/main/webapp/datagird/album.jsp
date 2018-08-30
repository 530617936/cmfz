<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">

    $(function () {

        var button1 = [{
            text:'保存',
            handler:function(){

            }
        },{
            text:'关闭',
            handler:function(){
                $("#dd1").dialog("close")
            }
        }]




        var toolbars = [{
            iconCls: 'icon-edit',
            text:"专辑详情",
            handler: function () {
                $('#dd1').dialog({
                    href:'${pageContext.request.contextPath}/form/AlbumForm.jsp',
                    title: 'My Dialog',
                    width: 800,
                    height: 400,
                    closed: false,
                });
            }
        }, '-', {
            iconCls: 'icon-help',
            text:"添加专辑",
            handler: function () {
                $('#dd1').dialog({
                    href:'${pageContext.request.contextPath}/form/AddAlbumForm.jsp',
                    title: 'My Dialog',
                    width: 300,
                    height: 400,
                    closed: false,
                    buttons:button1
                });
            }
        }, '-', {
            iconCls: 'icon-edit',
            text:"添加章节",
            handler: function () {
                alert('帮助按钮')
            }
        }, '-', {
            iconCls: 'icon-help',
            text:"下载音频",
            handler: function () {
                alert('帮助按钮')
            }
        }]

        $('#tt1').treegrid({
            url: '${pageContext.request.contextPath}/Album/selectAll',
            idField: 'id',
            treeField: 'title',
            columns: [[
                {field: 'id', title: '编号', width: 60},
                {field: 'title', title: '名称', width: 180},
                {field: 'audioPath', title: '下载路径', width: 80},
                {field: 'size', title: '章节大小', width: 80},
                {field: 'duration', title: '章节时长', width: 80}
            ]],
            fitColumns: true,
            fit: true,
            toolbar: toolbars,
            animate:true
        });
    })

</script>


<table id="tt1" style="width:600px;height:400px"></table>
<div id="dd1">
</div>
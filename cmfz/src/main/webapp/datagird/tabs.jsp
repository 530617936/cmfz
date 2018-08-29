<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">

    var button = [{
        text:'保存',
        handler:function(){
            $("#ff").form({
                url: "${pageContext.request.contextPath}/Banner/insert",
                success: function (res) {
                    if(res>0){
                        $('#dd').dialog('close')
                        $("#dg").edatagrid("load")
                    }
                }

            });

            $("#ff").submit();
        }
    },{
        text:'关闭',
        handler:function(){
            $('#dd').dialog('close')
        }
    }]

    var toolbar = [{
        text:"添加",
        iconCls: 'icon-edit',
        handler: function(){
            $('#dd').dialog({
                title: '添加',
                width: 350,
                height: 250,
                closed: false,
                cache: false,
                href: '${pageContext.request.contextPath}/form/BannerForm.jsp',
                modal: true,
                buttons: button
            });
        }

    },'-',{
        text:"删除",
        iconCls: 'icon-help',
        handler:function(){
            $('#dg').edatagrid('destroyRow');



        }
    },'-',{
        text:"修改",
        iconCls: 'icon-help',
        handler: function () {
            var row = $("#dg").edatagrid("getSelected");
            if(row!=null){
               var index = $("#dg").edatagrid("getRowIndex",row);
                //当前行可编辑
                $("#dg").edatagrid("editRow",index);
            }else{
                alert("请先选中行");

            }
        }
    },'-',{
        text:"保存",
        iconCls: 'icon-help',
        handler:function () {
            $("#dg").edatagrid('saveRow')
        }

        }


    ]

    $('#dg').edatagrid({
        url:'${pageContext.request.contextPath}/Banner/selectAll',
        updateUrl:"${pageContext.request.contextPath}/Banner/update",
        destroyUrl:"${pageContext.request.contextPath}/Banner/delete",
        columns:[[
            {field:'id',title:'编号',width:100},
            {field:'title',title:'名称',width:100},
            {field:'imgPath',title:'图片路径',width:100,},
            {field:'description',title:'图片描述',width:100,},
            {field:'status',title:'状态',width:100, editor:{
                type:"numberbox", options:{required:true}
                }},
            {field:'createDate',title:'上传日期',width:100,}
        ]],
        pagination:true,
        fit:true,
        pageList:[5,10,15,20,25],
        pageSize:5,
        toolbar: toolbar,
        fitColumns: true,
        striped:true,
        pageNumber:1,
        view: detailview,
        detailFormatter: function(rowIndex, rowData){
            return '<table><tr>' +
                '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}' + rowData.imgPath +'" style="height:50px;"></td>' +
                '<td style="border:0">' +
                '<p>CreateDate: ' + rowData.createDate + '</p>' +
                '<p>Status: ' + rowData.status + '</p>' +
                '</td>' +
                '</tr></table>';}





    });



</script>

<table id="dg"></table>

<div id="dd">Dialog Content.</div>
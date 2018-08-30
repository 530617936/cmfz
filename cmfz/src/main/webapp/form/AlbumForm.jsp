<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">
        $(function () {
            var index=null;
            var row = $("#tt1").treegrid("getRoot");
            if(row!=null){
                index = row.id;
            }else{
                alert("请先选中一行");
            }

            $("#ttdetail").treegrid({
                url:'${pageContext.request.contextPath}/Album/selectAll',
                idField:'id',
                treeField:'title',
                columns:[[
                    {field:'id',title:'编号',width:60},
                    {field:'title',title:'名称',width:150,},
                    {field:'count',title:'集数',width:80},
                    {field:'corverImg',title:'封面',width:80},
                    {field:'score',title:'评分',width:80},
                    {field:'author',title:'作者',width:80},
                    {field:'broadCast',title:'播音员',width:80},
                    {field:'brife',title:'简介',width:80},
                    {field:'publicDate',title:'出版日期',width:80},
                    {field:'createDate',title:'上传日期',width:80},
                    {field:'status',title:'状态',width:80}
                ]],
                fitColumns: true,
                fit: true,
                animate:true
            });


        })


</script>

<table id="ttdetail" style="width:600px;height:400px"></table>


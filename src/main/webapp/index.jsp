<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.js"></script>
    <script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            testRequestBody();
        });
        function testRequestBody(){
           $.post("${pageContext.request.contextPath}/json/testRequestBody",null,
               function (data) {
                $.each(data,function () {
                    var tr = $("<tr align='center' />");
                    $("<td/>").html(this.id).appendTo(tr);
                    $("<td/>").html(this.name).appendTo(tr);
                    $("<td/>").html(this.author).appendTo(tr);
                    $("#booktable").append(tr);
                })
           },"json");
        }
    </script>
</head>
<body>
<h2>测试返回JSON格式的数据</h2>
<table id="booktable" border="1" style="border-collapse: collapse;">
    <tr align='center'>
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>
</table>
</body>

</html>

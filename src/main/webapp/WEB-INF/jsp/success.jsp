<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>测试表单数据格式化</title>
</head>
<body>
    <form:form modelAttribute="account" method="post" action="">
        <table>
            <tr>
                <td><label>日期类型:</label></td>
                <td><form:input path="birthday"/></td>
            </tr>
            <tr>
                <td><label>整数类型:</label></td>
                <td><form:input path="total"/></td>
            </tr>
            <tr>
                <td><label>百分数类型:</label></td>
                <td><form:input path="discount"/></td>
            </tr>
            <tr>
                <td><label>货币类型:</label></td>
                <td><form:input path="money"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>

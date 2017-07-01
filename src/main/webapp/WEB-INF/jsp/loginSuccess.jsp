<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>测试表单验证</title>
</head>
<body>
    <form:form modelAttribute="loginUser" method="post" action="">
        <table>
            <tr>
                <td><label>用户名:</label></td>
                <td><form:input path="username"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>

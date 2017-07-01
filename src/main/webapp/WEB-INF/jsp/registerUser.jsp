<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form:form modelAttribute="loginUser" action="/loginUser/login" method="post">
        <table>
            <tr>
                <td><label>登录名:</label></td>
                <td><form:input path="username"/></td>
                <td><form:errors path="username" cssStyle="color:red"/></td>
            </tr>
            <tr>
                <td><label>密  码:</label></td>
                <td><form:input path="password"/></td>
                <td><form:errors path="username" cssStyle="color:red"/></td>
            </tr>
            <tr>
                <td><label>年  龄:</label></td>
                <td><form:input path="age"/></td>
                <td><form:errors path="username" cssStyle="color:red"/></td>
            </tr>
            <tr>
                <td><label>邮  箱:</label></td>
                <td><form:input path="email"/></td>
                <td><form:errors path="email" cssStyle="color:red"/></td>
            </tr>
            <tr>
                <td><label>生  日:</label></td>
                <td><form:input path="birthday"/></td>
                <td><form:errors path="birthday" cssStyle="color:red"/></td>
            </tr>
            <tr>
                <td><label>电话号码:</label></td>
                <td><form:input path="phone"/></td>
                <td><form:errors path="phone" cssStyle="color:red"/></td>
            </tr>
            <tr>
                <td><input type="submit" id="submit" value="注册"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>form:checkboxes测试</title>
</head>
<body>
    <form:form modelAttribute="student" method="post" action="checkForm" >
        <table>
            <tr>
                <td>选择课程:</td>
                <td>
                    <form:checkboxes path="courses" items="${courseList}"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>

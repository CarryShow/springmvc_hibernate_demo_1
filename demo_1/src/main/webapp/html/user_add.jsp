<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>添加SB</h2>

<p>html自带的表单提交</p>

<form action="result" method="get">
    <label for="name">姓名:</label>
    <input type="text" name="name" id="name"/>
    <br>
    <label for="age">年龄:</label>
    <input type="number" name="age" id="age"/>
    <input type="submit">
</form>

<p>springMVC的表单提交</p>
<form:form action="html/result.jsp" method="get" modelAttribute="user">
    姓名：<form:input path="name"/>
    <br>
    年龄：<form:input path="age"/>
    <input type="submit">
</form:form>


</body>
</html>

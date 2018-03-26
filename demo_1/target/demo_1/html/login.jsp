<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<div style="padding-top: 25px" align="center">


    <h2 style="margin-bottom: 30px">登陆</h2>

    <p>登陆管理员账号！</p>

    <form action="result">
        <div>
            <label>账户 :&nbsp</label> <input type="text" name="account">
        </div>

        <div style="margin-top: 15px">
            <label>密码 :&nbsp</label> <input type="password" name="psw">
        </div>
        <input style="margin-top: 50px;margin-left: 200px" type="submit">
    </form>
</div>


</body>
</html>

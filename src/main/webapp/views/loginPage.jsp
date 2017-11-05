<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>登录</title>

<body>
<form action="/user/login" method="post">
            <tr>
                用户<input type="text" name="userName"   style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
            </tr>
            <tr>
                密码<input type="password" name="userPwd"  style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;">
            </tr>
            <tr>
                    <input type=submit value="登陆"/>${message}
                    <%--<c:if test="${!empty message }">--%>
                    <%--</c:if>--%>
            </tr>
</form>
</body>
</html>

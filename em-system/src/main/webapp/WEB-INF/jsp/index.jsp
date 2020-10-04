<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <title>学生登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
<div class="box">
    <h3>欢迎你，同学</h3>
    <form action="${pageContext.request.contextPath}/studentLogin" method="post">
        <div class="inputBox">
            <input type="text" name="no" required>
            <label>账号</label>
        </div>
        <div class="inputBox">
            <input type="password" name="password" required>
            <label>密码</label>
            <input type="submit" value="登录">
        </div>
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/teacherLogin" title="教师登录" style="">我是教师</a>
    <a href="${pageContext.request.contextPath}/managerLogin" title="管理员登录" style="float:right;">我是管理员</a>
</div>

<% String message = (String) request.getAttribute("message");
    if (message != null) {
%>
<script type="text/javascript">
    alert("<%= message%>");
</script>
<%} %>
</body>
</html>
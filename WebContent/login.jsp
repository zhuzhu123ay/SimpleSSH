<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登录</h1>
	<form action="login_login" method="post">
		<table border="1" width="400">
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
			<tr>
				<td>${loginError}</td>
			</tr>
		</table>
		<textarea rows="" cols=""></textarea>
		
	</form>	
	<a href="register_loadinfo">是否已注册？请注册</a>
</body>
</html>
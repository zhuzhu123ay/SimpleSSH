<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="/struts-tags" prefix="s"%> --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//http://localhost:8888/sms_web
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h1>注册</h1>
	<form action="register_addRegisterinfo" method="post" >
		<table border="1" width="400">
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="realname" /></td>
			</tr>
			<tr>
				<td>Sex</td>
				<td><input type="text" name="sex" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>出生年份</td>
				<td><select class="form-control" name="birthdayYear">
						<c:forEach begin="0" end="30" var="year">
							<option>${2017+year }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>出生月份</td>
				<td><select class="form-control" name="birthdayMonth">
						<c:forEach begin="1" end="9" var="month">
							<option>0${month }</option>
						</c:forEach>
						<c:forEach begin="10" end="12" var="month">
							<option>${month }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><select class="form-control" name="birthdayDay">
						<c:forEach begin="1" end="9" var="day">
							<option>0${day }</option>
						</c:forEach>
						<c:forEach begin="10" end="31" var="day">
							<option>${day }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
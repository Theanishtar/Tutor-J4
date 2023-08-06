<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Danh sách User</title>
</head>
<body>
	<h1>chào mừng ${user.email}</h1>


	<c:if test="${user.isAdmin}">
		
		<table class="table">
			<thead>
				<tr>
					<th>UserID</th>
					<th>Email</th>
					<th>Password</th>
					<th>isActive</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${users}" var="u">
					<tr>
						<td>${u.getUserid()}</td>
						<td>${u.getEmail()}</td>
						<td>${u.getPassword()}</td>
						<td>${u.getIsActive()}</td>

						<td><a href="/ASM1-J4/showUser?id=${u.getUserid()}"> edit</a></td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
		
		<hr>
		<form action="/ASM1-J4/CRUD-User" method="post">
			Email: <input name="email" value="${ u.getEmail()}" /> <br>
			Password: <input name="password" value="${ u.getPassword()}" /> <br>
			isActive: <input name="isActive" value="${u.getIsActive() }" /> <br>
			
			<button type="submit">Thêm</button>
		</form>
		<button><a href="/ASM1-J4/CRUD-User?method=update&email=${ u.getEmail()}&${ u.getPassword()}"> Cập nhật</a></button>
		<button><a href="/ASM1-J4/CRUD-User?method=delete&id=${u.getUserid()}"> Xóa</a></button>

	</c:if>

	<c:if test="${!user.isAdmin}">
		<h1>Vui lòng sử dụng tài khoản ADMIN</h1>
	</c:if>

</body>
</html>
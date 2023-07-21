<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<form style="width: 800px; padding-left: 200px; padding-top: 200px"
		action="/Tutor-J4/register" method="post">
		<h2>Register</h2>
		<!-- Email input -->
		<div class="form-outline mb-4">
			<input type="email" name="mail" class="form-control" /> <label
				class="form-label" for="form2Example1">Email address</label>
		</div>

		<!-- Password input -->
		<div class="form-outline mb-4">
			<input type="password" name="pass" class="form-control" /> <label
				class="form-label" for="form2Example2">Password</label>
		</div>


		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block mb-4">Register</button>

		<a href="<c:url value='/login'/>"> Đăng nhập</a> <br>

	</form>

</body>
</html>
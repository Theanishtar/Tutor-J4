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
		action="/Tutor-J4/login" method="post">
		<h2>Login</h2>
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

		<!-- 2 column grid layout for inline styling -->
		<div class="row mb-4">
			<div class="col d-flex justify-content-center">
				<!-- Checkbox -->
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="form2Example31" checked /> <label class="form-check-label"
						for="form2Example31"> Remember me </label>
				</div>
			</div>

			<div class="col">
				<!-- Simple link -->
				<!-- <a href="#!">Forgot password?</a> -->
			</div>
		</div>

		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block mb-4">Login</button>

		<a href="<c:url value='/register'/>"> Đăng ký</a> <br>

		<!-- Register buttons -->
		<!-- <div class="text-center">
			<p>
				Not a member? <a href="#!">Login</a>
			</p>
			<p>or sign up with:</p>
			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-facebook-f"></i>
			</button>

			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-google"></i>
			</button>

			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-twitter"></i>
			</button>

			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-github"></i>
			</button>
		</div> -->
	</form>

</body>
</html>
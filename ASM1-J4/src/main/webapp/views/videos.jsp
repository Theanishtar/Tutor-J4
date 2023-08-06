<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Danh sách video</h1>
	
	<c:forEach var="video" items="${listVideo}">
		<h3>${video.title }</h3>
		<%-- <iframe width="560" height="315"
			src="${video.href }"
			title="YouTube video player" frameborder="0"
			allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
			allowfullscreen></iframe> --%>
		<img alt="" src="${video.poster}" style="width: 300px">
		<p>${video.like } Lượt thích</p>
		<hr style="margin-bottom: 50px">
	</c:forEach>
	

</body>
</html>
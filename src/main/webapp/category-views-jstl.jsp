<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%-- <%@ taglib prefix="f" uri="jakarta.tags.fmt"%> --%>
<!DOCTYPE html>
<html>
<head>
<title>Category View</title>
</head>
<body>
	<h2>Category View JSTL</h2>

	<!-- Display success message -->
	<c:if test="${not empty successMessage}">
		<p style="color: green;">${successMessage}</p>
	</c:if>
	<!-- Display category details -->
	<c:if test="${not empty category}">
		<p>
			<strong>Category Name:</strong> ${category.categoryName}
		</p>
<!-- 		<p> -->
<%-- 			<strong>Name:</strong> ${participant.name} --%>
<!-- 		</p> -->
<!-- 		<p> -->
<%-- 			<strong>Phone:</strong> ${participant.phone} --%>
<!-- 		</p> -->
<!-- 		<p> -->
<%-- 			<strong>Email:</strong> ${participant.email} --%>
<!-- 		</p> -->
<!-- 		<p> -->
<%-- 			<strong>Batch ID:</strong> ${participant.bid} --%>
<!-- 		</p> -->
<!-- 		<p> -->
<%-- 			<strong>Batch Name:</strong> ${participant.batchName} --%>
<!-- 		</p> -->
	</c:if>
</body>
</html>
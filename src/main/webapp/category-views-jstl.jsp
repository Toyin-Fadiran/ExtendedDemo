<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="f" uri="jakarta.tags.fmt"%>
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
		<p>
			<strong>Category Description:</strong>
			${category.categoryDescription}
		</p>
		<p>
			<strong>Category Image URL:</strong> ${category.categoryImageUrl}
		</p>
		<p>
			<strong>Category Active ID:</strong> ${category.active}
		</p>
		<p>
			<strong>Category Date added:</strong> ${category.addedOn}
		</p>

	</c:if>
</body>
</html>
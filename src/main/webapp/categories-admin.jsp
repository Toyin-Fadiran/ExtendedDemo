<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="f" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link href="css/styles.css" rel="stylesheet"> -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Bootstrap Example</title>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Your Custom Script for Tooltips -->
<script defer>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]');
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl));
    </script>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #F4F4F4;
	color: #333;
	margin: 0;
	padding: 0;
}
.container {
	width: 80%;
	margin: auto;
	padding: 20px;
	background: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
}
h2 {
	color: #007BFF;
	text-align: center;
}
/* Basic styling for the tooltip-triggering words */
.tooltip-trigger {
	color: #007BFF;
	text-decoration: none;
	transition: color 0.3s ease, text-shadow 0.3s ease;
	cursor: pointer;
}
/* Light up effect on hover */
.tooltip-trigger:hover {
	color: #0056B3;
	text-shadow: 0 0 5px rgba(0, 123, 255, 0.7);
}
.section {
	margin-bottom: 20px;
	padding: 15px;
	border: 1px solid #ddd;
	border-radius: 8px;
	background: #FAFAFA;
}
.section h3 {
	color: #333;
	margin-top: 0;
}
form label {
	display: block;
	margin: 8px 0 4px;
	font-weight: bold;
}
form input {
	width: calc(100% - 22px);
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
}
form button {
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	color: #fff;
	background-color: #007BFF;
	cursor: pointer;
}
form button:hover {
	background-color: #0056B3;
}
.messages {
	text-align: center;
}
.messages p {
	padding: 10px;
	border-radius: 4px;
	font-size: 16px;
	font-weight: bold;
}
.error {
	color: red;
	background-color: #fdd;
}
.success {
	color: green;
	background-color: #dfd;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Category Management</h2>
		<div>
			<p>
				Hover over the <span class="tooltip-trigger"
					data-bs-toggle="tooltip" title="This is a tooltip">Labels </span>
				to see the tooltip.
			</p>
		</div>
		<!-- Section to Retrieve Category by ID -->
		<div class="section">
			<h3>Retrieve Category by ID</h3>
			<form action="FrontController" method="get">
				<input type="hidden" name="type" value="categories"> <label
					for="id">Category ID:</label> <input type="number" id="id"
					name="id" value="${param.id}" required>
				<button type="submit">Submit</button>
			</form>
		</div>
		<c:if test="${not empty successMessage}">
			<div class="alert alert-secondary" role="alert">${successMessage}</div>
			<%-- <p class="success">${successMessage}</p> --%>
		</c:if>
		<!-- Section to Add a New Category -->
		<div class="section">
			<h3>Add a New Category</h3>
			<form action="FrontController" method="post">
				<input type="hidden" name="type" value="createCategory">
				<!-- Category Name -->
				<label for="categoryName" class="tooltip-trigger"
					data-bs-toggle="tooltip"
					title="Enter a unique and descriptive name for the category. This will be displayed in the category listings.">
					Category Name: </label> <input type="text" id="categoryName"
					name="categoryName" value="${param.categoryName}" required>
				<!-- Category Description -->
				<label for="categoryDesc" class="tooltip-trigger"
					data-bs-toggle="tooltip"
					title="Provide a brief description of what this category encompasses.">
					Category Description: </label> <input type="text" id="categoryDesc"
					name="categoryDesc" value="${param.categoryDesc}">
				<!-- Category Image URL -->
				<label for="categoryImgUrl" class="tooltip-trigger"
					data-bs-toggle="tooltip"
					title="Enter the URL of an image that represents the category.">
					Category Image URL: </label> <input type="url" id="categoryImgUrl"
					name="categoryImgUrl" value="${param.categoryImgUrl}">
				<!-- Active ID -->
				<label for="activeId" class="tooltip-trigger"
					data-bs-toggle="tooltip"
					title="Specify the active status ID for this category (e.g., 1 for active, 0 for inactive).">
					Active ID: </label> <input type="number" id="activeId" name="activeId"
					value="${param.activeId}">
				<!-- Added On Date -->
				<label for="addedOn" class="tooltip-trigger"
					data-bs-toggle="tooltip"
					title="Select the date when this category was added to the system.">
					Added On: </label> <input type="date" id="addedOn" name="addedOn"
					value="${param.addedOn}">
				<button type="submit">Add Category</button>
			</form>
		</div>
		<!-- Section to Update an Existing Category -->
		<div class="section">
			<h3>Update an Existing Category</h3>
			<form action="FrontController" method="post">
				<input type="hidden" name="type" value="updateCategory"> <input
					type="hidden" id="id" name="id" value="${param.id}"> <label
					for="categoryName">Category Name:</label> <input type="text"
					id="categoryName" name="categoryName" value="${param.categoryName}"
					required> <label for="categoryDesc">Category
					Description:</label> <input type="text" id="categoryDesc"
					name="categoryDesc" value="${param.categoryDesc}"> <label
					for="categoryImgUrl">Category Image URL:</label> <input type="url"
					id="categoryImgUrl" name="categoryImgUrl"
					value="${param.categoryImgUrl}"> <label for="activeId">Active
					ID:</label> <input type="number" id="activeId" name="activeId"
					value="${param.activeId}"> <label for="addedOn">Added
					On:</label> <input type="date" id="addedOn" name="addedOn"
					value="${param.addedOn}"><label for="addedOn">Added
					On:</label> <input type="date" id="addedOn" name="addedOn"
					value="${param.addedOn}"><label
					for="id">Category ID:</label> <input type="number" id="categoryId"
					name="categoryId" value="${param.categoryId}" required>
				<button type="submit">Update Category</button>
			</form>
		</div>
		<!-- Display Error and Success Messages -->
		<div class="messages">
			<c:if test="${not empty errorMessage}">
				<p class="error">${errorMessage}</p>
			</c:if>
			<%-- <c:if test="${not empty successMessage}"> --%>
			<%-- <p class="success">${successMessage}</p> --%>
			<%-- </c:if> --%>
			<c:if test="${not empty successMessage}">
				<div class="alert alert-primary" role="alert">${successMessage}</div>
<%-- 				<p class="success">${successMessage}</p> --%>
<%-- 				<p class="success">${categoryName}</p> --%>
			</c:if>
		</div>
	</div>
</body>
</html>
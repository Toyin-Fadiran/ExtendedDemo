<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style type="text/css">
h2 {
	align-content: center;
}
</style>
</head>
<body>
	<h2>Welcome to eStore ADMIN Java Backend</h2>

	<!-- Hyperlink to navigate to categories-admin.jsp using request.getContextPath() -->
	<p><a href="${pageContext.request.contextPath}/categories-admin.jsp">Go to Categories Admin Page</a></p>

	<!-- Static link to demonstrate the difference -->
	<p><a href="categories-admin.jsp">Static Link to admin Categories</a></p>
</body>
</html>

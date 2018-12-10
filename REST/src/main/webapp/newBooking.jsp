<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<tr>
				<td>Booking ID:</td>
				<td><form:input path="id"></form:input></td>
				<td><form:errors path="id"></form:errors></td>
		
			</tr>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fname"></form:input></td>
				<td><form:errors path="fname"></form:errors></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastname"></form:input></td>
				<td><form:errors path="lastname"></form:errors></td>
			</tr>
			<tr>
				<td>Manufacturer:</td>
				<td><form:input path="man"></form:input></td>
				<td><form:errors path="man"></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>

</body>
</html>
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
				<th>Booking Id</th>
				<th>First Name</th>
				<th>Last name</th>
				<th>manufacturer</th>
			</tr>
			
			<c:forEach items="${cars}" var="ships">
				<tr>
					<td>${cars.id}</td>
					<td>${cars.fname}</td>
					<td>${cars.lname}</td>
					<td>${cars.manufacturer}</td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>
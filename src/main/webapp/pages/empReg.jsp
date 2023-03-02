<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/saveEmployee" method="post">

	<table>

		<tr>
			<td>Employee NAME</td>
			<td><input type="text" name="employeeName"></td>
		</tr>

		<tr>
			<td>Employee Addr</td>
			<td><input type="text" name="employeeAddr"></td>
		</tr>

		<tr>
			<td>Employee Email</td>
			<td><input type="text" name="employeeEmail"></td>
		</tr>

		
		<tr>

			<td><input type="submit" name="REGISTER"></td>
		</tr>




	</table>
</form>

</body>
</html>
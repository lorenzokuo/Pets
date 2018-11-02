<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- dog -->
	<div class="container left">
		<form action="Dogs" method="POST">
			<h3>Make a Dog!</h3>
			<table>
				<tr>
					<td><label for="name">Name</label></td>
					<td><input type="text" id="name" name="name"></td>
				</tr>
				<tr>
					<td><label for="breed">Breed</label></td>
					<td><input type="text" id="breed" name="breed"></td>
				</tr>
				<tr>
					<td><label for="weight">Weight</label></td>
					<td><input type="text" id="weight" name="weight"></td>
				</tr>
			</table>
				<input type="submit" value="Submit">
		</form>
	</div>
	<!-- cat -->
	<div class="container right">
		<form action="Cats" method="POST">
			<h3>Make a Cat!</h3>
			<table>
				<tr>
					<td><label for="name">Name</label></td>
					<td><input type="text" id="name" name="name"></td>
				</tr>
				<tr>
					<td><label for="breed">Breed</label></td>
					<td><input type="text" id="breed" name="breed"></td>
				</tr>
				<tr>
					<td><label for="weight">Weight</label></td>
					<td><input type="text" id="weight" name="weight"></td>
				</tr>
			</table>
				<input type="submit" value="Submit">
		</form>
	</div>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration</h1>		<form action="/registerUser" method="post">
    <input type="text" name="username" placeholder="Username" required/><br>
    <input type="password" name="password" placeholder="Password" required/><br>
    <input type="text" name="firstname" placeholder="First Name" required/><br>
    <input type="text" name="lastname" placeholder="Last Name" required/><br>
    <input type="text" name="phone" placeholder="Phone" required/><br>
    <input type="email" name="email" placeholder="Email" required/><br>
    <input type="text" name="address" placeholder="Address" required/><br>
    <button type="submit">Register</button>
</form><br><br>
	<a href="login">Login</a>
		
    
</body>
</html>
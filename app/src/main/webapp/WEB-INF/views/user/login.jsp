<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	${message}
	<form action="/app/user/login.do" method="post">
		<table>
			<tr>
				<td><input type="text" name="userId" placeholder="ID 입력"><td><br>
			</tr>
			<tr>
				<td><input type="password" name="userPw" placeholder="PW 입력"><td><br>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form>
	<a href="join"><button>회원가입</button></a>
</body>
</html>
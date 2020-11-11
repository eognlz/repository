<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입 페이지</h2>
	<!-- 아래 파일 받으려면 아래 enctype 필요! -->
	<form action="join" method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" id="userId">
				<button id="userck">중복 검사</button></td>
			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="userPw"></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="userName"></td>
			</tr>

			<tr>
				<td>전화번호</td>
				<!-- 정규표현식 : pattern=^[0][1][0-9](-\s)\d{4}(-\s)\d{4}-->
				<td><input type="text" name="userTel"></td>
			</tr>
			<tr>
				<td>프로필사진</td>
				<td><input type=file name="file"></td>
			</tr>
			<tr>
				<td><input type="submit" value="회원가입"></td>
			</tr>

		</table>
	</form>
	<script>
		$(function() {
			var ck = false;
			$("#userck").on("click", function() {
				if ($("userId").val()) {
					$.ajax({
						url : "user/usercheck",
						type : "post",
						data : {userId : $("#userId").val()},
						dataType : "text",
						success : function(usercheck) {
							if (usercheck) {
								alert("사용 가능합니다.");
								$("#userck").remove();
								$("#userId").attr("redonly", true);
								ck = !ck;
							} else {
								alert("중복됩니다. 다른 아이디를 입력해주세요.");
							}
							return false;
						},
						error : function() {
							alert("ajax에 문제가 있습니다.");
							return false;
						}
					});
				} else {
					alert("값을 입력해주세요.");
					return false;
				}
			});
			$("#submit").on("click", function() {
				if (ck) {

				} else {
					alert("중복검사가 먼저 진행되어야 합니다.");
					return false;
				}
			})
		});
	</script>

</body>
</html>
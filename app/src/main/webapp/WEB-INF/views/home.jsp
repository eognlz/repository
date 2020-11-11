<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h3>${message}</h3>
<br><br>

<a href="emp/count"><button>1.사원의 수</button></a>
<form action="emp/count" method="get">
출력하려는 부서 번호를 입력하세요 : <input type="text" name="deptId">
<input type="submit" value="검색">
</form><br>

<form action="emp/deptList">
목록을 출력하는 부서 번호를 입력: <input type="text" name="deptId">
<input type="submit" value="검색">
</form>

<form action="emp/search">
이름검색으로 출력 : <select name="category">
                     <option value="first_Name">성</option>
                     <option value="last_Name">이름</option>
                  </select>
<input type=text name=search placeholder="검색어 입력">
<input type="submit" value="검색"> 
</form>
<a href="/app/user/login"><button>로그인 페이지</button></a>
<!-- </form action="emp/search"> 
<form action="emp/nameSearch">
2.이름으로 검색 : <input type="text" name="name">
<input type="submit" value="검색">
</form> -->
				
                 

<br>
<a href="emp/list"><button>2.사원 목록</button></a><br>

</body>
</html>

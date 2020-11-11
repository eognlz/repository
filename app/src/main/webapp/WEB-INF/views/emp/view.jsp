<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmpView</title>
</head>
<body>
<h2>사원 정보</h2>
<br>
<br>

<table border="1">
<tr>
<td>프로필사진</td>
<td><img src="/app/emp/pic/${emp.employeeId}" width=100/></td>
</tr>
<tr>
<td>사원번호 </td>
<td>${emp.employeeId}</td>
</tr>

<tr>
<td>이름</td>
<td>${emp.firstName } ${emp.lastName }</td>
</tr>

<tr>
<td>이메일</td>
<td>${emp.email }</td>
</tr>

<tr>
<td>연락처</td>
<td>${emp.phoneNumber }</td>
</tr>

<tr>
<td>입사일</td>
<td>${emp.hireDate }</td>
</tr>

<tr>
<td>직무</td>
<td>${empjobTitle} ${emp.jobId }</td>
</tr>

<tr>
<td>급여</td>
<td>${emp.salary }</td>
</tr>

<tr>
<td>보너스율</td>
<td>${emp.departmentId }</td>
</tr>

<tr>
<td>매니저번호</td>
<td>${emp.commissionPct }</td>
</tr>

<tr>
<td>부서번호</td>
<td>${emp.managerId }</td>
</tr>

</table>
<a href="update/${emp.employeeId}">정보 수정</a>&nbsp;&nbsp;<a href="delete/${emp.employeeId}">정보 삭제</a>
<%-- delete?empId=${emp.employeeId} 
	 delete/${emp.employeeId}
--%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Emp${message}</title>
</head>
<body>
	<h1>사원 정보 ${message eq "insert" ? '입력' : '수정'}</h1>
	<%-- <c:choose>
		<c:when test="${message eq insert}">
		</c:when>
	<c:otherwise> --%>


	<%-- <form action="${message}" method="post">
<table border="1"> --%>
	<form:form action="/app/emp/update?empId=${message}" method="post"
		modelAttribute="emp" enctype="multipart/form-data">
		<table border=1>
			<tr>
				<th>Employee_id</th>
				<td><form:input path="employeeId" /> <form:errors
						path="employeeId" />
					<button id="check">중복 검사</button></td>
			</tr>
			<tr>
				<th>First_name</th>
				<td><form:input path="firstName" /> <form:errors
						path="firstName" /></td>
			</tr>
			<tr>
				<th>Last_name</th>
				<td><form:input path="lastName" /> <form:errors
						path="lastName" /></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><form:input path="email" /> <form:errors path="email" /></td>
			</tr>
			<tr>
				<th>Phone_number</th>
				<td><form:input path="phoneNumber" /> <form:errors
						path="phoneNumber" /></td>
			</tr>
			<tr>
				<th>Hire_date</th>
				<td><form:input path="hireDate" type="date" required="required" />
					<form:errors path="hireDate" /></td>
			</tr>
			<tr>
				<th>Job_id</th>
				<td><form:select path="jobId">
						<c:forEach var="job" items="${jobList}">
							<option value="${job.jobId}">${job.jobTitle}</option>
						</c:forEach>
					</form:select> <%-- <form:select path="jobId">
						<form:options item="${jobList}" itemLabel="jobTitle"
							itemValue="jobId" />
					</form:select></td> --%>
			</tr>
			<tr>
				<th>Salary</th>
				<td><form:input path="salary" /> <form:errors path="salary" /></td>
			</tr>
			<tr>
				<th>Commission_pct</th>
				<td><form:input path="commissionPct" type="number" step="0.05" />
					<form:errors path="commissionPct" /></td>
			</tr>
			<tr>
				<th>Manager_id</th>
				<td><form:select path="managerId">
						<c:forEach var="man" items="${manList}">
							<option value="${man.managerId}">${man.managerName}</option>
						</c:forEach>
					</form:select></td>
			</tr>
			<tr>
				<th>Department_id</th>
				<td><form:select path="departmentId">
						<c:forEach var="dept" items="${deptList}">
							<option value="${dept.departmentId}">${dept.departmentName}</option>
						</c:forEach>
					</form:select></td>
			</tr>
			<tr>
				<td>프로필 사진(5Mb 이하)</td>
				<td><input type=file name=file></td>
			</tr>
			<tr>
				<!-- onsubmit="return check(); -->
				<th colspan=2><input type=submit value="저장" id="submit">
					<input type=reset value="취소"></th>
			</tr>

		</table>
	</form:form>

	<script>
		$(function(){
			var ck = false;
			$("#check").on("click",function(){
				if($("#employeeId").val()){
					$.ajax({
						url : "check",
						type : "post",
						data : {empId : $("#employeeId").val()},
						dataType : "text",
						success : function(check){
							//console.log("값이 머냐? :"+check);
							if(check){//true 일때 중복이 안됫다.  
								alert("중복되지 않습니다.");
								$("#check").remove();
								$("#employeeId").attr("readonly",true);
								ck = !ck;
							}else{
								alert("사원번호가 중복됩니다.");
							}
							return false;
						},
						error : function(){
							alert("ajax에 문제가 있습니다.");
							return false;
						}
					});
				}else{
					alert("값을 입력해주세요.");
					return false;
				}
			});
			
			$("#submit").on("click",function(){	
			if(ck){
				
			}else{
				alert("중복검사가 먼저 진행되어야 합니다.");
				return false;
			}
		})
			
		});
	
	</script>

	<%-- 	</c:otherwise>
	</c:choose> --%>
	<%-- <tr>
	<td>사원번호</td><td><input type=text name=employeeId value="${emp.employeeId }" ${empty emp ? "" : "readonly" }></td>
</tr>
<tr>
	<td>성, 이름</td><td><input type=text name=firstName value="${emp.firstName }">&nbsp;<input type="text" name="lastName" value="${emp.lastName }"></td>
</tr>
<tr>
	<td>이메일</td><td><input type=text name=email value="${emp.email }" ${empty emp ? "" : "readonly" }></td>
</tr>
<tr>
	<td>연락처</td><td><input type=text name=phoneNumber value="${emp.phoneNumber }" ></td>
</tr>
<tr>
	<td>입사일</td><td><input type="date" name=hireDate value="${emp.hireDate }"></td>
</tr>
<tr>
	<td>직무</td><td><select name=jobId>
	<c:forEach var="job" items="${jobList}">
	<option value="${job.jobId}" ${emp.jobId eq job.jobId ? "selected" : ""} >${job.jobTitle}</option>
	
	</c:forEach>
	</select>
	</td>
<tr>
	<td>급여</td><td><input type=text name=salary value="${emp.salary }"></td>
</tr>
<tr>
	<td>보너스율</td><td><input type=number min=0 max=0.95 step=0.05 name=commissionPct value="${emp.commissionPct }"></td>
</tr>
<tr>
	<td>매니저번호</td><td><select name="managerId">
	<c:forEach var="man" items="${manList }">
	<option value="${man.managerId }" ${emp.managerId eq man.managerId ? "selected" : "" }>${man.managerName }</option>
	</c:forEach>
	</select>
	</td>
</tr>
<tr>
	<td>부서번호</td><td><select name=departmentId>
	<c:forEach var="dept" items="${deptList }">
	<option value="${dept.departmentId }" ${emp.departmentId eq dept.departmentId ? "selected" : ""}>${dept.departmentName } </option>
	</c:forEach>
	</select>
	</td>
</tr>
</table>
<input type="submit" value="${message eq 'insert' ? '저장' : '수정'}"><input type=reset value="취소">
</form> --%>

</body>
</html>
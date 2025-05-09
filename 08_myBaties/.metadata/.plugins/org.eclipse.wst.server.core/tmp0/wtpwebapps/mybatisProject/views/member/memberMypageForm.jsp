<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<jsp:include page="../common/menubar.jsp" />

		<div class="outer">
			<br>
			<h1 align="center">마이페이지</h1>
			<br>
                                                               
			<form action="insertMember.me" method="post">
				<table align="center">
					<tr>
						<td>* ID</td>
						<td><input type="text" name="userId" required value="${loginUser.userId}"></td>
					</tr>
					<tr>
						<td>* PWD</td>
						<td><input type="password" name="userPwd" required value="${loginUser.userPwd}"></td>
					</tr>
					<tr>
						<td>* NAME</td>
						<td><input type="text" name="userName" required value="${loginUser.userName}"></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;EMAIL</td>
						<td><input type="email" name="email" value="${loginUser.email}"></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;BIRTHDAY</td>
						<td><input type="text" name="birthday" placeholder="생년월일(6자리)" value="${loginUser.birthday}"></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;GENDER</td>
						<td>

							<input type="radio" name="gender" value="M" > 남
							<input type="radio" name="gender" value="F" > 여
						
						</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;PHONE</td>
						<td><input type="text" name="phone" placeholder="-포함" value="${loginUser.phone}"></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;ADDRESS</td>
						<td><input type="text" name="address" value="${loginUser.address}"></td>
					</tr>
				</table>

				<br>
				<div align="center">
						<button type="submit" class="btn btn-sm btn-success">정보수정</button>
						<button type="button" class="btn btn-sm btn-warning" data-bs-toggle="modal" data-bs-target="#update-pwd-modal">비밀번호 변경</button>
						<button type="button" class="btn btn-sm btn-danger" data-bs-toggle="modal" data-bs-target="#delete-member-modal">회원탈퇴</button>
					</div>
			</form>
		</div>

		<script>

			const radios = document.querySelectorAll('input[name="gender"]');
			
			for(radi of radios){
				if (radi.value === "${loginUser.gender}") {
					radi.checked = true;
				}
			}
		
		</script>
	</body>

	</html>
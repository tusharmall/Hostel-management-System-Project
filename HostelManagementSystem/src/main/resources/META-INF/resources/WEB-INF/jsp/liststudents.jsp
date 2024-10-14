<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>Your Students</h1>
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>Room Number</th>
						<th>
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${students}" var="student">
						<tr>
							<td>${student.name}</td>
							<td>${student.email}</td>
							<td>${student.roomNumber}</td>
							<td>
								<a href="delete-student?id=${student.id}" class="btn btn-warning">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-student" class="btn btn-success">Add Student</a>
			
						</div>
						<%@ include file="common/footer.jspf" %>

<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>

		<div class="container">
			<h1>Enter Student Details</h1>
			<form:form method="post" modelAttribute="student">
				<fieldset class="mb-3">
					<form:label path="name">Name</form:label>
					<form:input type="text" path="name" required="required" />
					<form:errors path="name" cssClass="text-warning" />
				</fieldset>
				<fieldset class="mb-3">
					<form:label path="email">Email</form:label>
					<form:input type="email" path="email" required="required" />
					<form:errors path="email" cssClass="text-warning" />
				</fieldset>
				<fieldset class="mb-3">
					<form:label path="roomNumber">Room Number</form:label>
					<form:input type="text" path="roomNumber" required="required" />
				</fieldset>
				<input type="submit" class="btn btn-success" />
			</form:form>



			<br>
				<br>
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
				</div>

				<%@ include file="common/footer.jspf" %>

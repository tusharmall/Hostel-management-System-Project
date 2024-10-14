<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>

		<div class="container">
			<h1>Your Courses</h1>
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Duration (Months)</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${courses}" var="course">
						<tr>
							<td>${course.name}</td>
							<td>${course.durationInMonths}</td>
							<td>
								<a href="delete-course?id=${course.id}" class="btn btn-warning">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-course" class="btn btn-success">Add Course</a>
		</div>

		<%@ include file="common/footer.jspf" %>

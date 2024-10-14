<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>

		<div class="container">
			<h1>Enter Course Details</h1>
			<form:form method="post" modelAttribute="course">
				<fieldset class="mb-3">
					<form:label path="name">Course Name</form:label>
					<form:input type="text" path="name" required="required" />
					<form:errors path="name" cssClass="text-warning" />
				</fieldset>
				<fieldset class="mb-3">
					<form:label path="durationInMonths">Duration (Months)</form:label>
					<form:input type="text" path="durationInMonths" required="required" />
				</fieldset>
				<input type="submit" class="btn btn-success" value="Add Course"/>
			</form:form>

			<br>

				<!-- Now show the list of existing courses -->
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
			</div>

			<%@ include file="common/footer.jspf" %>

<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
<style>
        
      .container {
			background-color: white;
           /* max-width: 600px;*/
            margin: 0 auto;
            padding: 50px;
            border: 2px solid black; /* Black border */
            border-radius: 25px; /* Rounded corners for rectangular circular shape */
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);  /* Optional shadow */
        }

        .table {
            /*width: 106%;*/
            border-collapse: collapse;
        }

        .table th, .table td {
           padding: 3px;
            text-align: left;
            border-bottom: 0px solid #ddd;
        }

        .table th {
            background-color: #f2f2f2;
        }

        .btn {
            padding: 3px 15px;
            border-radius: 5px;
            text-decoration: none;
            color: white;
            text-align: center;
        }

        .btn-warning {
            background-color: #f0ad4e;
        }

        .btn-success {
            background-color: #5cb85c;
        }

        .btn-warning:hover, .btn-success:hover {
            opacity: 0.8;
        }
    </style>
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

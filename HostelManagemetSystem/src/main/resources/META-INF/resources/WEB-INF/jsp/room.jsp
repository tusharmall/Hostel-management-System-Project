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
			<form:form method="post" modelAttribute="room">
				<fieldset class="mb-3">
					<form:label path="roomNumber">Room Number</form:label>
					<form:input type="text" path="roomNumber" required="required" />
					<form:errors path="roomNumber" cssClass="text-warning" />
				</fieldset>

				<fieldset class="mb-3">
					<form:label path="isOccupied">Is Occupied?</form:label>
					<form:select path="isOccupied">
						<form:option value="YES">Yes</form:option>
						<form:option value="NO">No</form:option>
					</form:select>
					<form:errors path="isOccupied" cssClass="text-warning" />
				</fieldset>

				<input type="submit" class="btn btn-success" />
			</form:form>

			<br>
				<br>

					<h1>Your Rooms</h1>
					<table class="table">
						<thead>
							<tr>
								<th>Room Number</th>
								<th>Is Occupied?</th>
								<th>
								</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${rooms}" var="room">
								<tr>
									<td>${room.roomNumber}</td>
									<td>${room.isOccupied}</td>
									<td>
										<a href="delete-room?id=${room.id}" class="btn btn-warning">Delete</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<%@ include file="common/footer.jspf" %>

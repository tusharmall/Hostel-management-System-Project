<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>

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

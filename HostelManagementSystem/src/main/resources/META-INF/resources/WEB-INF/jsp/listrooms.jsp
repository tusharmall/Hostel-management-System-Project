<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
		<div class="container">
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
			<a href="add-room" class="btn btn-success">Add Room</a>
			
						</div>
						<%@ include file="common/footer.jspf" %>

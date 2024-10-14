<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
		<style>
.container {
    background-image: url('/images/Hostel.jpg');
    background-size: contain; /* Medium size image, scales while keeping aspect ratio */
    background-repeat: no-repeat; /* Prevents the image from repeating */
    background-position: center center; /* Center the image */
    background-color: #f2f2f2; /* Fallback background color */
    height: 81vh; /* Keeps the container height */
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}
</style>

		<div class="container text-center" style="color: white;">
			<!-- Welcome Text -->
			<p style="font-size: 1.5em; margin-top: 400px;  margin-bottom: 5px; color: black">Welcome to Hosteldayz</p>

			<!-- Main Heading -->
			<h1 style="font-size: 3em; margin-top: 0; color: black">A Best Place for Students</h1>
		</div>

		<%@ include file="common/footer.jspf" %>


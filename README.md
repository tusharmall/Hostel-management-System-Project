# Hostel Management System Application
This is a Spring Boot-based Hostel Management System Application designed to manage courses, rooms, and students in a hostel. The application uses Spring Security for authentication and Spring Data JPA for database interactions..


## Features
- **Course Management:** Add, view, and delete courses.
- **Room Management:** Add, view, and delete rooms..
- **Student Management:** Add, view, and delete student records.
- **User Authentication:** User authentication using Spring Security.

## Technologies Used
- Java 17
- Spring Boot 2.7.0
- Spring Data JPA
- Spring Security
- MySQL Database
- JSP for rendering views
- H2 Database (for testing)
- Maven for dependency management

## Screenshots

### Login Page
![Screenshot 2024-10-14 161256](https://github.com/user-attachments/assets/2fe98142-fca0-4996-971b-011de791a9ba)
### Welcome Page
![Screenshot 2024-10-14 161234](https://github.com/user-attachments/assets/0a55ae5a-baf0-4c77-ad34-31e393e398a8)

### Room Management
![Screenshot 2024-10-14 161434](https://github.com/user-attachments/assets/f2272b18-cf74-44ab-baac-b1b462f270ab)

![Screenshot 2024-10-14 161414](https://github.com/user-attachments/assets/24d05e13-e459-40b3-8408-1b6c01be60ad)

### Student Management
![Screenshot 2024-10-14 161357](https://github.com/user-attachments/assets/56377de6-9806-421d-a2db-1bfa5674b2c3)

![Screenshot 2024-10-14 161322](https://github.com/user-attachments/assets/d0e93fd2-3788-46a6-925e-7ae834447ce6)

### Course Management
![Screenshot 2024-10-14 161511](https://github.com/user-attachments/assets/be92f4d7-3f5f-4b2f-aee7-30660cd3499d)
![Screenshot 2024-10-14 161452](https://github.com/user-attachments/assets/a09c1fe3-891c-4f50-bb6c-6d443a3e28ef)


## Application Structure
- **CourseRepository:** Interface for CRUD operations on Course entities.
- **RoomRepository:** Interface for CRUD operations on Room entities.
- **StudentRepository:** Interface for CRUD operations on Student entities.

## Security Configuration
The application uses Spring Security for user authentication. The security configuration can be found in Springsecurityconfiguration.java. It sets up in-memory user details and configures HTTP security to require authentication for all requests.

## Frontend

The frontend is built using JSP for rendering views. It includes forms for entering course, room, and student details, as well as tables for displaying existing records.

## Acknowledgements
- Spring Boot Documentation
- Spring Security Documentation








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
- CSS
  

## Screenshots

### Login Page
![Screenshot 2024-10-14 161256](https://github.com/user-attachments/assets/2fe98142-fca0-4996-971b-011de791a9ba)
### Welcome Page
![Screenshot 2024-10-15 014647](https://github.com/user-attachments/assets/87bfe64c-6a68-4da8-ace2-7e76855404d1)

### Room Management
![Screenshot 2024-10-15 021150](https://github.com/user-attachments/assets/aac93bd9-6a54-4e6c-8b22-b18b8592ade7)

![image](https://github.com/user-attachments/assets/fc940334-0ac4-4c60-815c-de42020990c7)

### Student Management
![Screenshot 2024-10-15 021043](https://github.com/user-attachments/assets/d0cdcac0-ae21-4abd-aa21-02087109aeec)

![image](https://github.com/user-attachments/assets/75872ffd-78d9-4020-b2a5-7c530bd43203)

### Course Management
![Screenshot 2024-10-15 021238](https://github.com/user-attachments/assets/d00c038e-2b59-460b-a365-79f6a348f1d4)

![image](https://github.com/user-attachments/assets/4baeea5c-e835-4a05-bfe9-78433da8eb8c)


## Application Structure
- **CourseRepository:** Interface for CRUD operations on Course entities.
- **RoomRepository:** Interface for CRUD operations on Room entities.
- **StudentRepository:** Interface for CRUD operations on Student entities.

## Security Configuration
The application uses Spring Security for user authentication. The security configuration can be found in Springsecurityconfiguration.java. It sets up in-memory user details and configures HTTP security to require authentication for all requests.

## Frontend

The frontend is built using JSP for rendering views and CSS for styling. It includes forms for entering course, room, and student details, as well as tables for displaying existing records.

## Acknowledgements
- Spring Boot Documentation
- Spring Security Documentation








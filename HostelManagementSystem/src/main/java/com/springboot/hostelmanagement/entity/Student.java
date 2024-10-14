package com.springboot.hostelmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    @Size(min = 2, message = "Student name should have at least 2 characters")
    private String name;

    @Email
    private String email;

    private String roomNumber;

    public Student() {}

    public Student(int id, String name, String email, String roomNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

    // Getters and Setters
    
    
    
}

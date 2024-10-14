package com.springboot.hostelmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;
    
    @Size(min = 5, message = "Course name should have at least 5 characters")
    private String name;

    private int durationInMonths;

    public Course() {}

    public Course(int id, String name, int durationInMonths) {
        this.id = id;
        this.name = name;
        this.durationInMonths = durationInMonths;
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

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", durationInMonths=" + durationInMonths + "]";
	}

    // Getters and Setters
    // toString() method
    
}

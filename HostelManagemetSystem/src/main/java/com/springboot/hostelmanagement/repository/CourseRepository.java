package com.springboot.hostelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hostelmanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}

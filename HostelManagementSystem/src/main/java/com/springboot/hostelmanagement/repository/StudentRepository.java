package com.springboot.hostelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hostelmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

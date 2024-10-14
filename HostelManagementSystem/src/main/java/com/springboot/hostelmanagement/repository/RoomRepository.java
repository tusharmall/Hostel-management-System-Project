package com.springboot.hostelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hostelmanagement.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}

package com.springboot.hostelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.hostelmanagement.entity.Room;
@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}

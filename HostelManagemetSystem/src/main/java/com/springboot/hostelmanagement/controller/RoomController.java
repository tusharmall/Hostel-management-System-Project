package com.springboot.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.hostelmanagement.entity.Room;
import com.springboot.hostelmanagement.repository.RoomRepository;

import jakarta.validation.Valid;
@Controller
public class RoomController {

    private RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @RequestMapping("list-rooms")
    public String listRooms(ModelMap model) {
        model.addAttribute("rooms", roomRepository.findAll());
        return "listrooms";
    }

    @RequestMapping(value = "add-room", method = RequestMethod.GET)
    public String showAddRoomPage(ModelMap model) {
        model.put("room", new Room());
        model.put("rooms", roomRepository.findAll());  // List of existing rooms
//      
        return "room";
    }

    @RequestMapping(value = "add-room", method = RequestMethod.POST)
    public String addRoom(ModelMap model, @Valid Room room, BindingResult result) {
        if (result.hasErrors()) {
        	 model.put("rooms", roomRepository.findAll());  // List of existing rooms
//           
            return "room";
        }
        roomRepository.save(room);
        return "redirect:list-rooms";
    }

    @RequestMapping("delete-room")
    public String deleteRoom(@RequestParam int id) {
        roomRepository.deleteById(id);
        return "redirect:list-rooms";
    }
}

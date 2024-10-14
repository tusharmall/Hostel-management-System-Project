package com.springboot.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.hostelmanagement.entity.Course;
import com.springboot.hostelmanagement.repository.CourseRepository;

import jakarta.validation.Valid;

@Controller
public class CourseController {

    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // List all courses on a separate page
    @RequestMapping("list-courses")
    public String listCourses(ModelMap model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "listcourses";
    }

    // Show add course form with the list of existing courses
    @RequestMapping(value = "add-course", method = RequestMethod.GET)
    public String showAddCoursePage(ModelMap model) {
        model.put("course", new Course());  // Empty course form for new addition
        model.put("courses", courseRepository.findAll());  // List of existing courses
        return "course";  // Render course.jsp
    }

    // Add a new course and reload the same page showing the updated list
    @RequestMapping(value = "add-course", method = RequestMethod.POST)
    public String addCourse(ModelMap model, @Valid Course course, BindingResult result) {
        if (result.hasErrors()) {
            model.put("courses", courseRepository.findAll());  // Reload list in case of validation error
            return "course";
        }
        courseRepository.save(course);
        return "redirect:list-courses";  // Redirect to the same page to reload the list
    }

    // Delete course functionality
    @RequestMapping("delete-course")
    public String deleteCourse(int id) {
        courseRepository.deleteById(id);
        return "redirect:add-course";  // Redirect back to the form and course list
    }
}

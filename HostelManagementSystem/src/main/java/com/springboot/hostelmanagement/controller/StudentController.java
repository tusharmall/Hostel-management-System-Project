package com.springboot.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.hostelmanagement.entity.Student;
import com.springboot.hostelmanagement.repository.StudentRepository;

import jakarta.validation.Valid;

@Controller
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping("list-students")
    public String listStudents(ModelMap model) {
        model.addAttribute("students", studentRepository.findAll());
        return "liststudents";
    }

    @RequestMapping(value = "add-student", method = RequestMethod.GET)
    public String showAddStudentPage(ModelMap model) {
        model.put("student", new Student());
        model.put("students", studentRepository.findAll());  // List of existing students
        return "student";
    }

    @RequestMapping(value = "add-student", method = RequestMethod.POST)
    public String addStudent(ModelMap model, @Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
        	model.put("students", studentRepository.findAll());  // List of existing students
            return "student";
        }
        studentRepository.save(student);
        return "redirect:list-students";
    }

    @RequestMapping("delete-student")
    public String deleteStudent(@RequestParam int id) {
        studentRepository.deleteById(id);
        return "redirect:list-students";
    }
    
    
   // this code courses and students var for existing courses 
    
//    // Show add course form with the list of existing courses
//    @RequestMapping(value = "add-course", method = RequestMethod.GET)
//    public String showAddCoursePage(ModelMap model) {
//        model.put("course", new Course());  // Empty course form for new addition
//        model.put("courses", courseRepository.findAll());  // List of existing courses
//        return "course";  // Render course.jsp
//    }
//
//    // Add a new course and reload the same page showing the updated list
//    @RequestMapping(value = "add-course", method = RequestMethod.POST)
//    public String addCourse(ModelMap model, @Valid Course course, BindingResult result) {
//        if (result.hasErrors()) {
//            model.put("courses", courseRepository.findAll());  // Reload list in case of validation error
//            return "course";
//        }
//        courseRepository.save(course);
//        return "redirect:list-courses";  // Redirect to the same page to reload the list
//    }
}

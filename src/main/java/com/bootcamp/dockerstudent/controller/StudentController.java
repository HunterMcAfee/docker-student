package com.bootcamp.dockerstudent.controller;

import com.bootcamp.dockerstudent.model.Student;
import com.bootcamp.dockerstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/reverse")
    public List<Student> reverseStudents() {
        return studentService.reverseStudents();
    }
}

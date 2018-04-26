package com.bootcamp.dockerstudent.controller;

import com.bootcamp.dockerstudent.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        Student testStudent = new Student("Alex", 21);
        return testStudent;
    }
}

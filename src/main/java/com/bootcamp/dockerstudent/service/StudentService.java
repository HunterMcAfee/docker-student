package com.bootcamp.dockerstudent.service;

import com.bootcamp.dockerstudent.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        Student student1 = new Student("Rosslyn", 28);
        Student student2 = new Student("Josslyn", 28);
        Student student3 = new Student("Amos", 32);
        Student student4 = new Student("Victor", 24);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> reverseStudents() {
        List<Student> reversedList = new ArrayList<>();
        for (int i = 90; i >= 65; i--) {
            for (int j = 0; j < students.size(); j++) {
                if (Character.getNumericValue(students.get(j).getName().toUpperCase().charAt(0)) == Character.getNumericValue(i)) {
                    reversedList.add(students.get(j));
                }
            }
        }
        return reversedList;
    }
}

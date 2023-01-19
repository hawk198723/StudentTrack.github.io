package com.StudentTrack.service;

import com.StudentTrack.model.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;

public class StudentService {


    @GetMapping

    public Student getStudents() {
        Student mariam = new Student(1L, "Mariam", "mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 8), 22);
        return mariam;
    }
}

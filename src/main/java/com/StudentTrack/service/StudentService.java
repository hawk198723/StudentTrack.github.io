package com.StudentTrack.service;

import com.StudentTrack.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {

    public Student getStudents() {
        Student mariam = new Student(1L, "Mariam", "mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 8), 22);
        return mariam;
    }
}

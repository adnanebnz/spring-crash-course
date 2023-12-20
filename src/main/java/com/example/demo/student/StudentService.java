package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // means that this class is a bean
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                ));
    }
}

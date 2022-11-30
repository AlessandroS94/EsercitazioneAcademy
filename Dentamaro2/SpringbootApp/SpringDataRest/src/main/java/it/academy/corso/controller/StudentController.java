package it.academy.corso.controller;

import it.academy.corso.model.Student;
import it.academy.corso.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping
 @RestController("/api")

public class StudentController {
@Autowired
     StudentRepo SR;

     @GetMapping("/students")
     public ResponseEntity<List<Student>> getAllStudents() {
         List<Student> students = new ArrayList<Student>();

         SR.findAll().forEach(students::add);

         if (students.isEmpty()) {
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }

         return new ResponseEntity<>(students, HttpStatus.OK);
     }

 }
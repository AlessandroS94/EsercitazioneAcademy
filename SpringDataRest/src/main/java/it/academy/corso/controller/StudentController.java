package it.academy.corso.controller;

import it.academy.corso.model.Student;
import it.academy.corso.model.Tag;
import it.academy.corso.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository sR;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentes = new ArrayList<Student>();

        sR.findAll().forEach(studentes::add);

        if (studentes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(studentes, HttpStatus.OK);
    }


}

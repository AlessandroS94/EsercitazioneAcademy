package it.academy.corso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.academy.corso.model.Student;
import it.academy.corso.model.Tutorial;
import it.academy.corso.repository.StudenteRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
@Autowired
StudenteRepository studentRepository;

@PostMapping("/studente")
public ResponseEntity<Student> createStudent(@RequestBody Student student) {
  Student _student = studentRepository.save(new Student(student.getNome()));
  return new ResponseEntity<>(_student, HttpStatus.CREATED);
}

@GetMapping("/studente")
public ResponseEntity<List<Student>> getAllStudent(){
	
	    
  List<Student> student = studentRepository.findAll();
  
 

  return new ResponseEntity<>(student, HttpStatus.OK);
}

}

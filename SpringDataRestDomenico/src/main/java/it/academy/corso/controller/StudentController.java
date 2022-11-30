package it.academy.corso.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.academy.corso.repository.StudentRepository;
import it.academy.corso.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import it.academy.corso.exception.ResourceNotFoundException;
import it.academy.corso.model.Student;
import it.academy.corso.model.Tutorial;

@SuppressWarnings("unused")
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/student")
public class StudentController {

  @Autowired
  StudentRepository studentRepository;

  @GetMapping("/getAll")
  public ResponseEntity<List<Student>> getAllTutorials() {
    
	  List<Student> student = studentRepository.findAll(); 

    return new ResponseEntity<>( student, HttpStatus.OK);
  }

  @PostMapping("/postStudent")
  public ResponseEntity<Student> postStudent(@RequestBody Student student) {
	  studentRepository.save(new Student(student.getId(),student.getNome()));
    return new ResponseEntity<>(student, HttpStatus.CREATED);
  }
  
  /*
  @PostMapping("/tutorials")
  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
    Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), true));
    return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
  }
  */
}

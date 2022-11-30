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
import org.springframework.web.bind.annotation.RestController;

import it.academy.corso.model.Student;
import it.academy.corso.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	// metodo che restituisce lista studenti

	@GetMapping("/getstudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = new ArrayList<Student>();	
			studentRepository.findAll();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
		

	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student _student = studentRepository.save(new Student(student.getNome()));
		return new ResponseEntity<>(_student, HttpStatus.CREATED);
	}

}

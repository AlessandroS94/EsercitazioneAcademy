package it.academy.corso.repository;

import it.academy.corso.model.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
	  List<Student> findAll();
;
}
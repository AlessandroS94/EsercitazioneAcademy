package it.academy.corso.repository;

import it.academy.corso.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Long> {

}
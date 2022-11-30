package it.academy.corso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.academy.corso.model.Student;

public interface StudenteRepository extends JpaRepository<Student, Long>{

}

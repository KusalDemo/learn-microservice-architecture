package com.simplehrms.students.repository;

import com.simplehrms.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
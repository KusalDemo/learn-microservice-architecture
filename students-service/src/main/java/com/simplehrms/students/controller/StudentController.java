package com.simplehrms.students.controller;

import com.simplehrms.students.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<String> getAllStudents() {
        return ResponseEntity.ok("Students GET triggered");
    }

}
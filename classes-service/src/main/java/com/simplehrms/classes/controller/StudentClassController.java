package com.simplehrms.classes.controller;

import com.simplehrms.classes.client.StudentClient;
import com.simplehrms.classes.dto.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/classes")
public class StudentClassController {

    private final StudentClient studentClient;

    @GetMapping("/{classId}/students/{studentId}")
    public ResponseEntity<StudentResponse> getStudentInClass(@PathVariable Long classId, @PathVariable Long studentId) {
        StudentResponse student = studentClient.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }
}
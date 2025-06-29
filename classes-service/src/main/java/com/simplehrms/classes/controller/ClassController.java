package com.simplehrms.classes.controller;

import com.simplehrms.classes.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/classes")
public class ClassController {

    private final ClassService classService;

    @GetMapping
    public ResponseEntity<String> getAllClasses() {
        return ResponseEntity.ok("Classes GET triggered");
    }

}
package com.simplehrms.classes.controller;

import com.simplehrms.classes.model.Class;
import com.simplehrms.classes.service.ClassService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/classes")
public class ClassController {

    private final ClassService classService;

    @GetMapping
    public Iterable<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Class> getClassById(@PathVariable Long id) {
        Class classEntity = classService.getClassById(id);
        return ResponseEntity.ok(classEntity);
    }

    @PostMapping
    public ResponseEntity<Class> createClass(@RequestBody @Valid Class classEntity) {
        Class createdClass = classService.createClass(classEntity);
        return new ResponseEntity<>(createdClass, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Class> updateClass(@PathVariable Long id, @RequestBody @Valid Class classEntity) {
        Class updatedClass = classService.updateClass(id, classEntity);
        return ResponseEntity.ok(updatedClass);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
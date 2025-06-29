package com.simplehrms.classes.service;

import com.simplehrms.classes.model.Class;
import com.simplehrms.classes.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassService {

    private final ClassRepository classRepository;

    public Iterable<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class getClassById(Long id) {
        return classRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found for ID: " + id));
    }

    public Class createClass(Class classEntity) {
        return classRepository.save(classEntity);
    }

    public Class updateClass(Long id, Class classEntity) {
        classRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found for ID: " + id));
        classEntity.setId(id);
        return classRepository.save(classEntity);
    }

    public void deleteClass(Long id) {
        Class classEntity = classRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found for ID: " + id));
        classRepository.delete(classEntity);
    }
}
package com.simplehrms.classes.repository;

import com.simplehrms.classes.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
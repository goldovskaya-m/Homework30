package com.example.demo30.service;

import com.example.demo30.model.Student;

import java.util.Collection;

public interface StudentService {
    long add(Student faculty);

    Student update(Long id, Student faculty);

    Student deletById(Long id);

    Student findById(Long id);

    Collection<Student> FindAll();
}

package com.example.demo30.service;

import com.example.demo30.model.Student;

import java.util.Collection;

public interface StudentService {
    long add(Student student);

    Student update(Long id, Student faculty);

    Student deleteById(Long id);

    Student findById(Long id);

    Collection<Student> FindAll();

    Collection<Student> FindByAge(int age);
}

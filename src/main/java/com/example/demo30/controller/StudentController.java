package com.example.demo30.controller;

import com.example.demo30.model.Student;
import com.example.demo30.service.FacultyService;
import com.example.demo30.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public long add(@RequestBody Student student) {
        return studentService.add(student);
    }
    @PutMapping("/{id}/update")
    public Student update(@PathVariable("id") Long id,
                          @RequestBody Student student) {
        return studentService.update(id, student);
    }
    @DeleteMapping("/{id}/remove")
    public Student deleteById(@PathVariable("id") Long id){
        return studentService.deletById(id);
    }
    @GetMapping("/{id}/get")
    public Student findById(@PathVariable("id") Long id) {
        return studentService.findById(id);
    }
    @GetMapping("/get/all")
    public Collection<Student> FindAll() {
        return null;
    }
}

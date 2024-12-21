package com.example.demo30.controller;

import com.example.demo30.model.Faculty;
import com.example.demo30.model.Student;
import com.example.demo30.service.FacultyService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/faculty")

public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping("/add")
    public long add(@RequestBody Faculty faculty) {
        return facultyService.add(faculty);
    }

    @PutMapping("/{id}/update")
    public Faculty update(@PathVariable("id") Long id,
                          @RequestBody Faculty faculty) {
        return facultyService.update(id, faculty);
    }

    @DeleteMapping("/{id}/remove")
    public Faculty deleteById(@PathVariable("id") Long id) {
        return facultyService.deleteById(id);
    }

    @GetMapping("/{id}/get")
    public Faculty findById(@PathVariable("id") Long id) {
        return facultyService.findById(id);
    }

    @GetMapping("/get/all")

    public Collection<Faculty> FindAll() {
        return facultyService.FindAll();
    }


    @GetMapping("/get/all")
    public Collection<Faculty> FindByAge(@RequestParam("age") int age) {
        return facultyService.FindAll();
    }
}


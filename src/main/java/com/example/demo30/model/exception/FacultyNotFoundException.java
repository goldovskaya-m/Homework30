package com.example.demo30.model.exception;

import com.example.demo30.model.Faculty;

public class FacultyNotFoundException extends RuntimeException{
    private final long id;

    public FacultyNotFoundException(long id) {
        super("Faculty not found by id: [%s]".formatted(id));
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

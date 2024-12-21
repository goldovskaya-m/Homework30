package com.example.demo30.model.exception;

public class StudentNotFoundException extends RuntimeException{
    private final long id;

    public StudentNotFoundException(long id) {
        super("Faculty not found by id: [%s]".formatted(id));
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

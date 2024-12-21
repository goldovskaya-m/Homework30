package com.example.demo30.service;

import com.example.demo30.model.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
@Service
public class StudentServiceImpl implements StudentService {
    private final Map<Long, Student> repository = new HashMap<>();
    private long counter = 0;

    @Override
    public long add(Student student) {
        student.setId(++counter);
        repository.put(counter, student);
        return counter;
    }

    @Override
    public Student update(Long id, Student student) {
        checkStudentExist(id);
        //Student studentForUpdate = repository.get(id);

        return repository.put(id, student);
    }

    @Override
    public Student deletById(Long id) {
        checkStudentExist(id);
        return repository.remove(id);

    }

    @Override
    public Student findById(Long id) {
        return repository.get(id);
    }

    @Override
    public Collection<Student> FindAll() {
        return Collections.unmodifiableCollection
                (repository.values());
    }

    private void checkStudentExist(Long id) {
       if (!repository.containsKey(id)) {
           throw new RuntimeException();
        }
    }
}

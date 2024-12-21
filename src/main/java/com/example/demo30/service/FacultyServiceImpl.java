package com.example.demo30.service;

import com.example.demo30.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class FacultyServiceImpl  implements FacultyService {
    private final Map<Long, Faculty> repository = new HashMap<>();
    private long counter = 0;

    @Override
    public long add(Faculty faculty) {
        faculty.setId(++counter);
        repository.put(counter, faculty);
        return counter;
    }

    @Override
    public Faculty update(Long id, Faculty faculty) {
        checkFacultyExistExist(id);
        return repository.put(id, faculty);
    }

    @Override
    public Faculty deleteById(Long id) {
        checkFacultyExistExist(id);
        return repository.remove(id);
    }

    @Override
    public Faculty findById(Long id) {
        return repository.get(id);
    }

    @Override
    public Collection<Faculty> findAll() {
        return Collections.unmodifiableCollection
                (repository.values());
    }



    @Override
    public  Collection<Faculty> findByColor(String color) {
        return repository.values().stream()
                .filter(st -> Objects.equals(st.getColor(),color))
                .toList();
    }

    private void checkFacultyExistExist(Long id) {
        if (!repository.containsKey(id)) {
            throw new RuntimeException();
        }

    }
}

package com.enoca.challenge.services;

import com.enoca.challenge.entities.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface StudentService {

    public Student save(Student student);
    public Optional<Student> getOneById(int id);
    public List<Student> getAll();
    public void update(Student student);
    public void delete(int id);
}

package com.enoca.challenge.servicesImp;

import com.enoca.challenge.entities.Student;
import com.enoca.challenge.repositories.StudentRepo;
import com.enoca.challenge.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    private StudentRepo studentRepo;

    @Autowired
    public StudentServiceImp(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student save(Student student) {
        Student savedStudent = studentRepo.save(student);
        return savedStudent;
    }

    @Override
    public Optional<Student> getOneById(Long id) {
        if (!studentRepo.existsById(id)){
            throw new RuntimeException("Böyle bir öğrenci yok.");
        }
        return studentRepo.findById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }


    @Override
    public void delete(Long id) {
        studentRepo.deleteById(id);
    }
}

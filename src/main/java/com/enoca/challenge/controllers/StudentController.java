package com.enoca.challenge.controllers;

import com.enoca.challenge.entities.Student;
import com.enoca.challenge.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(int id){
        return studentService.getOneById(id);
    }

    @PostMapping()
    public Student save(@RequestBody Student student){
        student.setId(0);
        Student savedStudent = studentService.save(student);
        return savedStudent;
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable int id){
        studentService.delete(id);
    }

    @PutMapping()
    public Student update (@RequestBody Student student){
        Student savedStudent = studentService.save(student);
        return savedStudent;
    }

    @GetMapping("/{lastName}")
    public List<Student> getOneByLastName(@PathVariable String lastName){
        return studentService.getOneByLastName(lastName);
    }
}

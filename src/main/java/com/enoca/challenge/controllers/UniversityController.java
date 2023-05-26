package com.enoca.challenge.controllers;
import com.enoca.challenge.entities.University;
import com.enoca.challenge.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    private  UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }


    @GetMapping
    public List<University> getAll(){
        return universityService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<University> getUniversityById(int id){
        return universityService.getOneById(id);
    }

    @PostMapping()
    public University save(@RequestBody University university){
        university.setId(0);
        University savedUniversity = universityService.save(university);
        return savedUniversity;
    }

    @DeleteMapping("/{id}")
    public void deleteUniversityById(@PathVariable int id){
        universityService.delete(id);
    }

    @PutMapping()
    public University update (@RequestBody University university){
        University savedUniversity = universityService.save(university);
        return savedUniversity;
    }
}

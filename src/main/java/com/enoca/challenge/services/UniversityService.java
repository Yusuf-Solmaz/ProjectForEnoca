package com.enoca.challenge.services;

import com.enoca.challenge.entities.University;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UniversityService {

    public University save(University university);
    public Optional<University> getOneById(int id);
    public List<University> getAll();
    public void delete(int id);
}

package com.enoca.challenge.servicesImp;

import com.enoca.challenge.entities.University;
import com.enoca.challenge.repositories.UniversityRepo;
import com.enoca.challenge.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityServiceImp implements UniversityService {
    private UniversityRepo universityRepo;

    @Autowired
    public UniversityServiceImp(UniversityRepo universityRepo) {
        this.universityRepo = universityRepo;
    }

    @Override
    public University save(University university) {
        University savedUniversity = universityRepo.save(university);
        return savedUniversity;
    }

    @Override
    public Optional<University> getOneById(Long id) {
        return universityRepo.findById(id);
    }

    @Override
    public List<University> getAll() {
        return universityRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        universityRepo.deleteById(id);
    }
}

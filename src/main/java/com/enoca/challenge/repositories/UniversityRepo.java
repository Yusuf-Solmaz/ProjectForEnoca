package com.enoca.challenge.repositories;

import com.enoca.challenge.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepo extends JpaRepository<University,Long> {
}

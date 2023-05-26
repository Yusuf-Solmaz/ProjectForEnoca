package com.enoca.challenge.repositories;

import com.enoca.challenge.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

}

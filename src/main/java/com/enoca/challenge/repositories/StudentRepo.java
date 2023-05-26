package com.enoca.challenge.repositories;

import com.enoca.challenge.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT * FROM Student WHERE last_name = :last_name", nativeQuery = true)
    List<Student> findByLastName(@Param("last_name") String last_name);
}

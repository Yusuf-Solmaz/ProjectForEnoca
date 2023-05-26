package com.enoca.challenge.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "universityName")
    private String universityName;


    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL)
    private List<Student> students;
}

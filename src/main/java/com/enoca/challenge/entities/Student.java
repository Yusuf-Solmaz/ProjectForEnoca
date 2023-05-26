package com.enoca.challenge.entities;

import jakarta.persistence.*;
import lombok.Data;


@Table(name = "student")
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastName")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

}

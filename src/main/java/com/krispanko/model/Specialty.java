package com.krispanko.model;

import com.krispanko.model.Doctor;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "specialty")
    private Set<Doctor> doctors;
}
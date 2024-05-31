package com.krispanko.model;

import com.krispanko.model.Doctor;

import javax.persistence.*;
import java.util.Set;

public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "hospital")
    private Set<Doctor> doctors;
}

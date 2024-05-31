package com.krispanko.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class DoctorSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private LocalDateTime dateTime;

    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

}
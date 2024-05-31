package com.krispanko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.krispanko.model")
@EnableJpaRepositories(basePackages = "com.krispanko")
public class DoctorScheduleApp {
    public static void main(String[] args) {
        SpringApplication.run(DoctorScheduleApp.class, args);
    }
}

package com.krispanko.respository;

import com.krispanko.model.DoctorSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, Long> {
}
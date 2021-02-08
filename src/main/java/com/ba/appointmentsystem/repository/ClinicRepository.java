package com.ba.appointmentsystem.repository;

import com.ba.appointmentsystem.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic,Long> {
}

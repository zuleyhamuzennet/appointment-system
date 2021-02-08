package com.ba.appointmentsystem.repository;

import com.ba.appointmentsystem.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments,Long> {
}

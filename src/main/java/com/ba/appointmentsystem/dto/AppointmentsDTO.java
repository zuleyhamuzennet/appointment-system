package com.ba.appointmentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class AppointmentsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalTime time;
    @NotNull(message = "Notes must have a value")
    private String note;
    @NotNull(message = "Patient must have a value")
    private Long patientId;
    @NotNull(message = "Doctor must have a value")
    private Long doctorId;
    @NotNull(message = "Clinic must have a value")
    private Long polyclinicId;
}

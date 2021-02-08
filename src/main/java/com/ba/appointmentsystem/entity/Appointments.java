package com.ba.appointmentsystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Appointments{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Date must have a value")
    private LocalDate date;
    @NotNull(message = "Time must have a value")
    private LocalTime time;
    @NotNull(message = "Notes must have a value")
    private String note;

    @NotNull(message = "Patient must have a value")
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @NotNull(message = "Doctor must have a value")
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @NotNull(message = "Clinic must have a value")
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "polyclinic_id")
    private Clinic clinic;


}

package com.ba.appointmentsystem.controller;

import com.ba.appointmentsystem.dto.PatientDTO;
import com.ba.appointmentsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping
    public List<PatientDTO> listAllPatients(){
        return patientService.listAllPatients();
    }

}

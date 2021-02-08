package com.ba.appointmentsystem.controller;

import com.ba.appointmentsystem.dto.ClinicDTO;
import com.ba.appointmentsystem.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    @Autowired
    ClinicService clinicService;

    @GetMapping
    public List<ClinicDTO> listAllClinics(){
        return clinicService.listAllClinics();
    }
}

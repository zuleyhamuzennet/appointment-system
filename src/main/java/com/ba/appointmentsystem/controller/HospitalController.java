package com.ba.appointmentsystem.controller;

import com.ba.appointmentsystem.dto.HospitalDTO;
import com.ba.appointmentsystem.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;

    @GetMapping
    public List<HospitalDTO> listAllHospitals(){
        return hospitalService.listAllHospitals();
    }
}

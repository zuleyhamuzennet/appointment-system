package com.ba.appointmentsystem.controller;

import com.ba.appointmentsystem.dto.DoctorDTO;
import com.ba.appointmentsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping
    public List<DoctorDTO> listAllDoctors(){
        return doctorService.listAllDoctors();
    }
}

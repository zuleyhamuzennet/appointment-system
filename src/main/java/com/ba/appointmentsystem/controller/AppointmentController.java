package com.ba.appointmentsystem.controller;

import com.ba.appointmentsystem.dto.AppointmentsDTO;
import com.ba.appointmentsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public AppointmentsDTO addAppointment(@Valid @RequestBody AppointmentsDTO appointmentsDTO){
        return appointmentService.addAppointment(appointmentsDTO);
    }
    @GetMapping
    public List<AppointmentsDTO> listAllAppointments(){
        return appointmentService.listAllAppointments();
    }
}

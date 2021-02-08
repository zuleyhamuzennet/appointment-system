package com.ba.appointmentsystem.service;

import com.ba.appointmentsystem.dto.DoctorDTO;
import com.ba.appointmentsystem.entity.Doctor;
import com.ba.appointmentsystem.mapper.DoctorMapper;
import com.ba.appointmentsystem.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    DoctorMapper doctorMapper;

    public List<DoctorDTO> listAllDoctors(){
        List<Doctor> doctors= doctorRepository.findAll();
        return doctorMapper.toDTOS(doctors);
    }
}

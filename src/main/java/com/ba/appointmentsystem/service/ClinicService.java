package com.ba.appointmentsystem.service;

import com.ba.appointmentsystem.dto.ClinicDTO;
import com.ba.appointmentsystem.entity.Clinic;
import com.ba.appointmentsystem.mapper.ClinicMapper;
import com.ba.appointmentsystem.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {
    @Autowired
    ClinicRepository clinicRepository;

    @Autowired
    ClinicMapper clinicMapper;

    public List<ClinicDTO> listAllClinics(){
        List<Clinic> clinics= clinicRepository.findAll();
        return clinicMapper.toDTOS(clinics);
    }
}

package com.ba.appointmentsystem.service;

import com.ba.appointmentsystem.dto.PatientDTO;
import com.ba.appointmentsystem.entity.Patient;
import com.ba.appointmentsystem.mapper.PatientMapper;
import com.ba.appointmentsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientMapper patientMapper;

    public List<PatientDTO> listAllPatients(){
        List<Patient> patients= patientRepository.findAll();
        return patientMapper.toDTOS(patients);
    }
}

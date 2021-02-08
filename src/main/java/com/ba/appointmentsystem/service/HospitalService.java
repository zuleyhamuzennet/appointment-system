package com.ba.appointmentsystem.service;

import com.ba.appointmentsystem.dto.HospitalDTO;
import com.ba.appointmentsystem.entity.Hospital;
import com.ba.appointmentsystem.mapper.HospitalMapper;
import com.ba.appointmentsystem.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    HospitalMapper hospitalMapper;

    public List<HospitalDTO> listAllHospitals(){
        List<Hospital> hospitals= hospitalRepository.findAll();
        return hospitalMapper.toDTOS(hospitals);
    }
}

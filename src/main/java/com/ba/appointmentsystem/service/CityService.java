package com.ba.appointmentsystem.service;

import com.ba.appointmentsystem.dto.CityDTO;
import com.ba.appointmentsystem.entity.City;
import com.ba.appointmentsystem.mapper.CityMapper;
import com.ba.appointmentsystem.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CityMapper cityMapper;

    public List<CityDTO> listAllCity(){
        List<City> cities= cityRepository.findAll();
        return cityMapper.toDTOS(cities);
    }
}

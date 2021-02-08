package com.ba.appointmentsystem.mapper;

import com.ba.appointmentsystem.dto.CityDTO;
import com.ba.appointmentsystem.entity.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface CityMapper {
    City toEntity(CityDTO cityDTO);
    CityDTO toDTO(City city);
    List<CityDTO> toDTOS(List<City> cities);
}

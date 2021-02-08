package com.ba.appointmentsystem.mapper;

import com.ba.appointmentsystem.dto.HospitalDTO;
import com.ba.appointmentsystem.entity.Hospital;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface HospitalMapper {
    Hospital toEntity(HospitalDTO hospitalDTO);
    HospitalDTO toDTO(Hospital hospital);
    List<HospitalDTO> toDTOS(List<Hospital> hospitals);

}

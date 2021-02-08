package com.ba.appointmentsystem.mapper;

import com.ba.appointmentsystem.dto.ClinicDTO;
import com.ba.appointmentsystem.entity.Clinic;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface ClinicMapper {
    Clinic toEntity(ClinicDTO clinicDTO);
    ClinicDTO toDTO(Clinic clinic);
    List<ClinicDTO> toDTOS(List<Clinic> clinics);
}

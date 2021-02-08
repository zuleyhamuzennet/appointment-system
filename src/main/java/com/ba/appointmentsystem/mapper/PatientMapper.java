package com.ba.appointmentsystem.mapper;

import com.ba.appointmentsystem.dto.PatientDTO;
import com.ba.appointmentsystem.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring")
public interface PatientMapper {
    Patient toEntity(PatientDTO patientDTO);
    PatientDTO toDTO(Patient patient);
    List<PatientDTO> toDTOS(List<Patient> patients);
}

package com.ba.appointmentsystem.mapper;

import com.ba.appointmentsystem.dto.DoctorDTO;
import com.ba.appointmentsystem.entity.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring")
public interface DoctorMapper {
    Doctor toEntity(DoctorDTO doctorDTO);
    DoctorDTO toDTO(Doctor doctor);
    List<DoctorDTO> toDTOS(List<Doctor> doctors);

}

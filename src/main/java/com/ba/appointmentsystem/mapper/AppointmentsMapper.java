package com.ba.appointmentsystem.mapper;

import com.ba.appointmentsystem.dto.AppointmentsDTO;
import com.ba.appointmentsystem.entity.Appointments;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring")
public interface AppointmentsMapper {
    Appointments toEntity(AppointmentsDTO appointmentsDTO);
    AppointmentsDTO toDTO(Appointments appointments);
    List<AppointmentsDTO> toDTOS(List<Appointments> appointments);
}

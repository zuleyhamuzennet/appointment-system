package com.ba.appointmentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CityDTO extends BaseDTO {
    private List<HospitalDTO> hospitals;
}

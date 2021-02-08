package com.ba.appointmentsystem.dto;

import com.ba.appointmentsystem.entity.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalDTO extends BaseDTO{
    private City city;
}

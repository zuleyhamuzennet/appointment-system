package com.ba.appointmentsystem.controller;

import com.ba.appointmentsystem.dto.CityDTO;
import com.ba.appointmentsystem.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    CityService cityService;

    @Autowired
    MessageSource messageSource;

    @GetMapping
    public List<CityDTO> listAllCities(){
        return cityService.listAllCity();
    }

    @GetMapping("/hi")
    public String sayHello(@RequestHeader("Accept-Language") String locale){
        return messageSource.getMessage("welcome", null, new Locale(locale));

    }
}

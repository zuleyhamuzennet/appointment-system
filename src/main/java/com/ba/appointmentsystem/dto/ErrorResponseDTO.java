package com.ba.appointmentsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseDTO {
    private Date timestamp;
    private String message;
    private String details;

}

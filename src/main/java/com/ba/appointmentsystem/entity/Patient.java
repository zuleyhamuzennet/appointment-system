package com.ba.appointmentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Patient extends BaseEntity{
    private Long age;
    private Long tc;
}

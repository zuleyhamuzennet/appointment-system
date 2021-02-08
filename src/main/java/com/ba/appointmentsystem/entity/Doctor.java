package com.ba.appointmentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Doctor  extends BaseEntity{
    @Column(name = "regist_num")
    private Long registrationNumber;

}

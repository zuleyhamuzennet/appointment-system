package com.ba.appointmentsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class City  extends BaseEntity{
    @OneToMany(mappedBy = "city")
    @JsonIgnore
    private List<Hospital> hospitals;
}

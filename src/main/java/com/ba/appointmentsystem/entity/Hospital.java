package com.ba.appointmentsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Hospital extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "hospital_clinics", joinColumns = @JoinColumn(name = "hospital_id"),
    inverseJoinColumns = @JoinColumn(name = "clinic_id"))
    private Set<Clinic> clinics = new HashSet<>();

}

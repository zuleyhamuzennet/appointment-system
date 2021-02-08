package com.ba.appointmentsystem.service;

import com.ba.appointmentsystem.dto.AppointmentsDTO;
import com.ba.appointmentsystem.entity.*;
import com.ba.appointmentsystem.exception.SystemException;
import com.ba.appointmentsystem.mapper.AppointmentsMapper;
import com.ba.appointmentsystem.repository.AppointmentsRepository;
import com.ba.appointmentsystem.repository.ClinicRepository;
import com.ba.appointmentsystem.repository.DoctorRepository;
import com.ba.appointmentsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    AppointmentsRepository appointmentsRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    ClinicRepository clinicRepository;

    @Autowired
    AppointmentsMapper appointmentsMapper;

    public AppointmentsDTO addAppointment(AppointmentsDTO appointmentsDTO){
        if(appointmentsDTO == null){
            throw new SystemException("canNotBeCreated");
        }
        Appointments appointments= new Appointments();
        setPatient(appointmentsDTO, appointments);
        setDoctor(appointmentsDTO, appointments);
        setClinic(appointmentsDTO, appointments);
        appointments.setDate(appointmentsDTO.getDate());
        appointments.setTime(appointmentsDTO.getTime());
        appointments.setNote(appointmentsDTO.getNote());

        appointmentsRepository.save(appointments);
        return appointmentsDTO;
    }

    private void setClinic(AppointmentsDTO appointmentsDTO, Appointments appointments) {
        if(appointmentsDTO.getPolyclinicId()!=null){
            Optional<Clinic> polyclinic= clinicRepository.findById(appointmentsDTO.getPolyclinicId());
            appointments.setClinic(polyclinic.get());
        }
    }

    private void setDoctor(AppointmentsDTO appointmentsDTO, Appointments appointments) {
        if(appointmentsDTO.getDoctorId()!=null){
            Optional<Doctor> doctor= doctorRepository.findById(appointmentsDTO.getDoctorId());
            appointments.setDoctor(doctor.get());
        }
    }

    private void setPatient(AppointmentsDTO appointmentsDTO, Appointments appointments) {
        if(appointmentsDTO.getPatientId()!=null){
            Optional<Patient> patient= patientRepository.findById(appointmentsDTO.getPatientId());
            appointments.setPatient(patient.get());
        }
    }

    public List<AppointmentsDTO> listAllAppointments(){
        List<Appointments> cities= appointmentsRepository.findAll();
        return appointmentsMapper.toDTOS(cities);
    }
}

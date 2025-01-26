package com.encatch.encatchservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatch.encatchservices.model.Appointment;
import com.encatch.encatchservices.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    public List<Appointment> getAppointmentsByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    public Appointment saveAppointment(Appointment appointment) {
        return repository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        repository.deleteById(id);
    }
}
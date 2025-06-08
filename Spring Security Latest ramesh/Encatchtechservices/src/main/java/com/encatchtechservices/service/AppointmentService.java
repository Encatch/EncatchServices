package com.encatchtechservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.Appointment;
import com.encatchtechservices.repo.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    public Appointment getByAppointmentsId(Integer appointmentsId) {
    	Optional<Appointment> data = repository.findById(appointmentsId);
    	if(data.isPresent()) {
    		return data.get();
    	}
    	return null;
    }

    public Appointment saveAppointment(Appointment appointment) {
        return repository.save(appointment);
    }

    public void deleteAppointment(Integer id) {
        repository.deleteById(id);
    }
}
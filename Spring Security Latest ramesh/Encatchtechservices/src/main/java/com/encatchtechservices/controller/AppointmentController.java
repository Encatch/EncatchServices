package com.encatchtechservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encatchtechservices.model.Appointment;
import com.encatchtechservices.service.AppointmentService;



@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Appointment> getAllAppointments() {
        return service.getAllAppointments();
    }

 

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
           return service.saveAppointment(appointment);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteAppointment(@PathVariable Integer id) {
        service.deleteAppointment(id);
    }
}

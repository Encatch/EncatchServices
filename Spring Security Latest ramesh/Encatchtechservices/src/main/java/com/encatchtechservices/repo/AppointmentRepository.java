package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}

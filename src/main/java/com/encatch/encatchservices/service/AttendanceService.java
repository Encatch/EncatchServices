package com.encatch.encatchservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatch.encatchservices.model.Attendance;
import com.encatch.encatchservices.repository.AttendanceRepository;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository repository;

    public List<Attendance> getAllAttendances() {
        return repository.findAll();
    }

    public Attendance saveAttendance(Attendance Attendance) {
        return repository.save(Attendance);
    }

    public void deleteAttendance(Long id) {
        repository.deleteById(id);
    }
}

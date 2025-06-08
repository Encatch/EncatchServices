package com.encatchtechservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.Attendance;
import com.encatchtechservices.repo.AttendanceRepository;

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

    public void deleteAttendance(Integer id) {
        repository.deleteById(id);
    }
}

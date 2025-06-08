package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

}

package com.encatch.encatchservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatch.encatchservices.model.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}

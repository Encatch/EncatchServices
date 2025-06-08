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

import com.encatchtechservices.model.Attendance;
import com.encatchtechservices.service.AttendanceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

	@Autowired
	private AttendanceService service;

	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public List<Attendance> getAllAttendance() {
		return service.getAllAttendances();
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public Attendance saveAttendance(@RequestBody Attendance attendance) {
		return service.saveAttendance(attendance);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteAttendance(@PathVariable Integer id) {
		service.deleteAttendance(id);
	}
}

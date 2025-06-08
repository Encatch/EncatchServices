package com.encatchtechservices.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "Appointment")
@Data
@Getter
@Setter
@SuppressWarnings("unused")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String appointmentName;
	private String appointerName;
	private String visitorName;
	private String purpose;
	private LocalDate date;

	// Getters and Setters
}

package com.encatch.encatchservices.controller;

import java.security.Principal;
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

import com.encatch.encatchservices.model.ProgressReport;
import com.encatch.encatchservices.service.ProgressReportService;

@RestController
@RequestMapping("/api/progress-reports")
public class ProgressReportController {

    @Autowired
    private ProgressReportService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<ProgressReport> getAllReports() {
        return service.getAllReports();
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('CUSTOMER')")
    public List<ProgressReport> getReportsByUser(Principal principal) {
        return service.getReportsByUserId(Long.parseLong(principal.getName())); // Assuming principal contains user ID
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ProgressReport saveReport(@RequestBody ProgressReport report) {
        return service.saveReport(report);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteReport(@PathVariable Long id) {
        service.deleteReport(id);
    }
}
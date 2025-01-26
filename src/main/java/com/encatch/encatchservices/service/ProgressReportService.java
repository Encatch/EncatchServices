package com.encatch.encatchservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatch.encatchservices.model.ProgressReport;
import com.encatch.encatchservices.repository.ProgressReportRepository;

@Service
public class ProgressReportService {

    @Autowired
    private ProgressReportRepository repository;

    public List<ProgressReport> getAllReports() {
        return repository.findAll();
    }

    public List<ProgressReport> getReportsByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    public ProgressReport saveReport(ProgressReport report) {
        return repository.save(report);
    }

    public void deleteReport(Long id) {
        repository.deleteById(id);
    }
}
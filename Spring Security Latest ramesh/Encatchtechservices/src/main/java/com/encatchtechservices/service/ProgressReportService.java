package com.encatchtechservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.ProgressReport;
import com.encatchtechservices.repo.ProgressReportRepository;

@Service
public class ProgressReportService {

	 @Autowired
	    private ProgressReportRepository repository;

	    public List<ProgressReport> getAllProgressReports() {
	        return repository.findAll();
	    }

	    public ProgressReport saveProgressReport(ProgressReport ProgressReport) {
	        return repository.save(ProgressReport);
	    }

	    public void deleteProgressReport(Long id) {
	        repository.deleteById(id);
	    }

		public ProgressReport getProgressReportById(Long id) {
			 return repository.getById(id);
		}

		public ProgressReport updateProgressReport(Long id, ProgressReport ProgressReport) {
			 return repository.save(ProgressReport);
		}
}
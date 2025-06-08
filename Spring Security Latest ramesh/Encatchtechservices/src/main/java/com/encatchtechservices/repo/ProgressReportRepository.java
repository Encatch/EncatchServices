package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.ProgressReport;

@Repository
public interface ProgressReportRepository extends JpaRepository<ProgressReport, Long> {
   // List<ProgressReport> findByProgressReportId(Long progressReportId);
}

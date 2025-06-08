package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.DayCare;

@Repository
public interface DayCareRepository extends JpaRepository<DayCare, Long> {
	
	//List<DayCare> findByDayCareId(Long dayCareId);

}

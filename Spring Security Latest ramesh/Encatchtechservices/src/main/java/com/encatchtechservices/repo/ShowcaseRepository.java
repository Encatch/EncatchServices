package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.Showcase;

@Repository
public interface ShowcaseRepository extends JpaRepository<Showcase, Long>{
	
	//List<Showcase> findByShowcaseId(Long showcaseId);

}

package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.DigitalContent;


@Repository
public interface DigitalContentRepository extends JpaRepository<DigitalContent, Long> {
	//List<DigitalContent> findByDigitalContentId(Long digitalContentId);

}

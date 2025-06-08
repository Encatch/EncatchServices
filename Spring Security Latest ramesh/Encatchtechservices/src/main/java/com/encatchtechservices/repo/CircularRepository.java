package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.Circular;

@Repository
public interface CircularRepository  extends JpaRepository<Circular, Integer>{

}

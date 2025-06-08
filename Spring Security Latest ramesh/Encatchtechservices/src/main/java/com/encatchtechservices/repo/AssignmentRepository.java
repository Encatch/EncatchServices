package com.encatchtechservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatchtechservices.model.Assignment;


@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {

}

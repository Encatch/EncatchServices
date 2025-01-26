package com.encatch.encatchservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encatch.encatchservices.model.Circular;

@Repository
public interface CircularRepository extends JpaRepository<Circular, Long> {
}

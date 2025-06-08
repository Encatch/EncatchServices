package com.encatchtechservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.DayCare;
import com.encatchtechservices.repo.DayCareRepository;

@Service
public class DayCareService {
	
	@Autowired
    private DayCareRepository repository;

    public List<DayCare> getAllDayCares() {
        return repository.findAll();
    }

    public DayCare saveDayCare(DayCare DayCare) {
        return repository.save(DayCare);
    }

    public void deleteDayCare(Long id) {
        repository.deleteById(id);
    }

	public DayCare getDayCareById(Long id) {
		 return repository.getById(id);
	}

	public DayCare updateDayCare(Long id, DayCare DayCare) {
		 return repository.save(DayCare);
	}

}

package com.encatchtechservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.Assignment;
import com.encatchtechservices.repo.AssignmentRepository;



@Service
public class AssignmentsService {
	
	 @Autowired
	    private AssignmentRepository repository;

	    public List<Assignment> getAllAssignmentss() {
	        return repository.findAll();
	    }

	    public Assignment saveAssignments(Assignment Assignments) {
	        return repository.save(Assignments);
	    }

	    public void deleteAssignments(Integer id) {
	        repository.deleteById(id);
	    }

		public Assignment getAssignmentsById(Integer id) {
			 return repository.getById(id);
		}

		public Assignment updateAssignments(Integer id, Assignment Assignments) {
			 return repository.save(Assignments);
		}
}

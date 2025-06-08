package com.encatchtechservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.Showcase;
import com.encatchtechservices.repo.ShowcaseRepository;

@Service
public class ShowcaseService {

	 @Autowired
	    private ShowcaseRepository repository;

	    public List<Showcase> getAllShowcases() {
	        return repository.findAll();
	    }

	    public Showcase saveShowcase(Showcase Showcase) {
	        return repository.save(Showcase);
	    }

	    public void deleteShowcase(Long id) {
	        repository.deleteById(id);
	    }

		public Showcase getShowcaseById(Long id) {
			 return repository.getById(id);
		}

		public Showcase updateShowcase(Long id, Showcase Showcase) {
			 return repository.save(Showcase);
		}
}

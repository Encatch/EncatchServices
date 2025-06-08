package com.encatchtechservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.DigitalContent;
import com.encatchtechservices.repo.DigitalContentRepository;

@Service
public class DigitalContentService {
	
	@Autowired
    private DigitalContentRepository repository;

    public List<DigitalContent> getAllDigitalContents() {
        return repository.findAll();
    }

    public DigitalContent saveDigitalContent(DigitalContent DigitalContent) {
        return repository.save(DigitalContent);
    }

    public void deleteDigitalContent(Long id) {
        repository.deleteById(id);
    }

	public DigitalContent getDigitalContentById(Long id) {
		 return repository.getById(id);
	}

	public DigitalContent updateDigitalContent(Long id, DigitalContent DigitalContent) {
		 return repository.save(DigitalContent);
	}

}

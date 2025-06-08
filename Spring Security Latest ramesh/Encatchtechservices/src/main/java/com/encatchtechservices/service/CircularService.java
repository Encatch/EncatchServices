package com.encatchtechservices.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatchtechservices.model.Circular;
import com.encatchtechservices.repo.CircularRepository;

@Service
public class CircularService {

    @Autowired
    private CircularRepository repository;

    public List<Circular> getAllCirculars() {
        return repository.findAll();
    }

    public Circular saveCircular(Circular circular) {
        return repository.save(circular);
    }

    public void deleteCircular(Integer id) {
        repository.deleteById(id);
    }
}
package com.encatch.encatchservices.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatch.encatchservices.model.Circular;
import com.encatch.encatchservices.repository.CircularRepository;

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

    public void deleteCircular(Long id) {
        repository.deleteById(id);
    }
}
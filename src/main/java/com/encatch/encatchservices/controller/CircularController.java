package com.encatch.encatchservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encatch.encatchservices.model.Circular;
import com.encatch.encatchservices.service.CircularService;

@RestController
@RequestMapping("/api/circulars")
public class CircularController {

    @Autowired
    private CircularService service;

    @GetMapping
    public List<Circular> getAllCirculars() {
        return service.getAllCirculars();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Circular saveCircular(@RequestBody Circular circular) {
        return service.saveCircular(circular);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteCircular(@PathVariable Long id) {
        service.deleteCircular(id);
    }
}

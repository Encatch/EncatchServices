package com.encatchtechservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encatchtechservices.model.DayCare;
import com.encatchtechservices.service.DayCareService;

@RestController
@RequestMapping("/api/dayCare")
public class DayCareController {

	@Autowired
    private DayCareService DayCareService;

    @GetMapping
    public List<DayCare> getAllDayCares() {
        return DayCareService.getAllDayCares();
    }

    @GetMapping("/{id}")
    public DayCare getTimeTableDetailsById(@PathVariable Long id) {
        return DayCareService.getDayCareById(id);
    }

    @PostMapping("")
    public DayCare createTimeTableDetails(@RequestBody DayCare DayCare) {
        return DayCareService.saveDayCare(DayCare);
    }

    @PutMapping("/{id}")
    public DayCare updateTimeTableDetails(@PathVariable Long id, @RequestBody DayCare DayCare) {
        return DayCareService.updateDayCare(id, DayCare);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeTableDetails(@PathVariable Long id) {
    	DayCareService.deleteDayCare(id);
    }
}

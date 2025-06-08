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

import com.encatchtechservices.model.Assignment;
import com.encatchtechservices.service.AssignmentsService;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentsController {

	@Autowired
    private AssignmentsService AssignmentsService;

    @GetMapping
    public List<Assignment> getAllAssignmentss() {
        return AssignmentsService.getAllAssignmentss();
    }

    @GetMapping("/{id}")
    public Assignment getTimeTableDetailsById(@PathVariable Integer id) {
        return AssignmentsService.getAssignmentsById(id);
    }

    @PostMapping("")
    public Assignment createTimeTableDetails(@RequestBody Assignment Assignments) {
        return AssignmentsService.saveAssignments(Assignments);
    }

    @PutMapping("/{id}")
    public Assignment updateTimeTableDetails(@PathVariable Integer id, @RequestBody Assignment assignments) {
        return AssignmentsService.updateAssignments(id, assignments);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeTableDetails(@PathVariable Integer id) {
    	AssignmentsService.deleteAssignments(id);
    }
}

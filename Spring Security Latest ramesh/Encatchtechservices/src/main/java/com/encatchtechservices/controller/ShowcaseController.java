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

import com.encatchtechservices.model.Showcase;
import com.encatchtechservices.service.ShowcaseService;

@RestController
@RequestMapping("/api/showcase")
public class ShowcaseController {
	
	@Autowired
    private ShowcaseService ShowcaseService;

    @GetMapping
    public List<Showcase> getAllShowcases() {
        return ShowcaseService.getAllShowcases();
    }

    @GetMapping("/{id}")
    public Showcase getTimeTableDetailsById(@PathVariable Long id) {
        return ShowcaseService.getShowcaseById(id);
    }

    @PostMapping("")
    public Showcase createTimeTableDetails(@RequestBody Showcase Showcase) {
        return ShowcaseService.saveShowcase(Showcase);
    }

    @PutMapping("/{id}")
    public Showcase updateTimeTableDetails(@PathVariable Long id, @RequestBody Showcase Showcase) {
        return ShowcaseService.updateShowcase(id, Showcase);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeTableDetails(@PathVariable Long id) {
    	ShowcaseService.deleteShowcase(id);
    }

}

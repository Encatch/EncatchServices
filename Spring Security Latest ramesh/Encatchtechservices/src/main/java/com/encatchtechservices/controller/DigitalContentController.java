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

import com.encatchtechservices.model.DigitalContent;
import com.encatchtechservices.service.DigitalContentService;

@RestController
@RequestMapping("/api/digitalcontent")
public class DigitalContentController {
	
	@Autowired
    private DigitalContentService DigitalContentService;

    @GetMapping
    public List<DigitalContent> getAllDigitalContents() {
        return DigitalContentService.getAllDigitalContents();
    }

    @GetMapping("/{id}")
    public DigitalContent getTimeTableDetailsById(@PathVariable Long id) {
        return DigitalContentService.getDigitalContentById(id);
    }

    @PostMapping("")
    public DigitalContent createTimeTableDetails(@RequestBody DigitalContent DigitalContent) {
        return DigitalContentService.saveDigitalContent(DigitalContent);
    }

    @PutMapping("/{id}")
    public DigitalContent updateTimeTableDetails(@PathVariable Long id, @RequestBody DigitalContent DigitalContent) {
        return DigitalContentService.updateDigitalContent(id, DigitalContent);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeTableDetails(@PathVariable Long id) {
    	DigitalContentService.deleteDigitalContent(id);
    }

}

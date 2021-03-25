package com.microservice.restservice.controller;

import com.microservice.restservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/name")
    private String getName() {
        return dataService.fetchName();
    }

}

package com.microservice.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instance")
public class InstanceInfoController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{appName}")
    private List<ServiceInstance> fetchInstancesByAppName(@PathVariable("appName") String appName) {
        return discoveryClient.getInstances(appName);
    }
}

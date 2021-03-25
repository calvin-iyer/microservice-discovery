package com.microservice.dataservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Value("${data.service.identifier}")
    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }

}

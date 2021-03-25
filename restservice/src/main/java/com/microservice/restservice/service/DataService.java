package com.microservice.restservice.service;

import com.microservice.restservice.client.DataServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    private DataServiceFeignClient dataServiceFeignClient;

    public String fetchName() {
        return dataServiceFeignClient.fetchName();
    }


}

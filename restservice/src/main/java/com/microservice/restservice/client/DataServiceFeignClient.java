package com.microservice.restservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("dataservice")
public interface DataServiceFeignClient {

    @GetMapping("/data/name")
    String fetchName();

}

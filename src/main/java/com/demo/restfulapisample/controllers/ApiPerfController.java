package com.demo.restfulapisample.controllers;

import com.demo.restfulapisample.entities.ApiPerfDetails;
import com.demo.restfulapisample.services.IApiPerfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 */
@RestController
public class ApiPerfController {

    @Autowired
    private IApiPerfService apiPerfService;

    @PostMapping(value = "/perf/report")
    public void addPerfDetailsInfo(@RequestBody ApiPerfDetails perfDetails) {
        apiPerfService.addPerfDetails(perfDetails);
    }
}

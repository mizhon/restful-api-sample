package com.demo.restfulapisample.controllers;

import com.demo.restfulapisample.entities.ApiPerfDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 */
@RestController
public class ApiPerfController {

    @PostMapping(value = "/perf/report")
    public void addPerfDetailInfo(ApiPerfDetails perfDetails) {
        // TODO 添加性能数据的上报方法
    }
}

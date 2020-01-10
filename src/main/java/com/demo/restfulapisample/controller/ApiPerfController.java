package com.demo.restfulapisample.controller;

import com.demo.restfulapisample.entity.ApiPerfDetail;
import com.demo.restfulapisample.entity.query.ApiPerfDetailQuery;
import com.demo.restfulapisample.service.IApiPerfService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ming
 */
@RestController
public class ApiPerfController {

    @Autowired
    private IApiPerfService apiPerfService;

    public PageInfo<ApiPerfDetail> getPerfDetails(ApiPerfDetailQuery query,
        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
        @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize) {
        return apiPerfService.getApiPerfDetails(query, pageNum, pageSize);
    }

    @PostMapping(value = "perf/report")
    public void addApiPerfDetail(@RequestBody ApiPerfDetail apiPerfDetail) {
        apiPerfService.addApiPerfDetail(apiPerfDetail);
    }

    @PostMapping(value = "perf/reports")
    public Integer batchAddApiPerfDetails(@RequestBody List<ApiPerfDetail> apiPerfDetails) {
        return apiPerfService.batchAddApiPerfDetails(apiPerfDetails);
    }
}

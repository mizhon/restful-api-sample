package com.demo.restfulapisample.services;

import com.demo.restfulapisample.entities.ApiPerfDetails;

public interface IApiPerfService {
    /**
     * 向数据库插入性能信息
     * @param details 性能信息
     */
    void addPerfDetails(ApiPerfDetails details);
}

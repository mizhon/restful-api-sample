package com.demo.restfulapisample.dao;

import com.demo.restfulapisample.entities.ApiPerfDetails;

public interface ApiPerfDao {

    /**
     * 插入性能监控数据
     * @param details ApiPerfDetails的实例
     */
    void insert(ApiPerfDetails details);
}

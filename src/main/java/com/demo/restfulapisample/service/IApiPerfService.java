package com.demo.restfulapisample.service;

import com.demo.restfulapisample.entity.ApiPerfDetail;
import com.demo.restfulapisample.entity.query.ApiPerfDetailQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IApiPerfService {
    /**
     * Service层，插入性能数据接口定义
     *
     * @param apiPerfDetail 性能信息实例
     */
    void addApiPerfDetail(ApiPerfDetail apiPerfDetail);

    /**
     * Service层，批量插入性能数据接口定义
     *
     * @param apiPerfDetails 性能信息实例List
     */
    Integer batchAddApiPerfDetails(List<ApiPerfDetail> apiPerfDetails);

    /**
     * Service层，获取性能数据
     *
     * @param query ApiPerfDetailQuery实例
     * @param pageNum 页数
     * @param pageSize 每页数据量
     * @return 性能信息列表
     */
    PageInfo<ApiPerfDetail> getApiPerfDetails(ApiPerfDetailQuery query, Integer pageNum, Integer pageSize);
}

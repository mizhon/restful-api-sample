package com.demo.restfulapisample.dao;

import com.demo.restfulapisample.entity.ApiPerfDetail;
import com.demo.restfulapisample.entity.query.ApiPerfDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApiPerfDao {

    /**
     * Dao层，插入性能监控数据
     *
     * @param detail PerfDetail实例
     */
    void insertApiPerfDetail(ApiPerfDetail detail);

    /**
     * Dao层，批量插入性能监控数据
     *
     * @param details PerfDetail实例List
     * @return 插入的条数
     */
    Integer batchInsertApiPerfDetails(List<ApiPerfDetail> details);

    /**
     * Dao层，查询性能监控列表信息
     *
     * @param query 查询条件
     * @return 返回ApiPerfDetail信息列表
     */
    List<ApiPerfDetail> queryApiPerfDetailList(@Param("query") ApiPerfDetailQuery query);
}

package com.demo.restfulapisample.dao;

import com.demo.restfulapisample.entity.BusinessLine;
import com.demo.restfulapisample.entity.query.BusinessLineQuery;

import java.util.List;

/**
 * @author ming
 */
public interface BusinessLineDao {
    /**
     * Dao层，插入业务线数据
     * @param businessLine 业务线实例信息
     */
    Integer insertBusinessLineInfo(BusinessLine businessLine);

    /**
     * Dao层，获取业务线数据列表
     * @return 返回业务线数据列表
     */
    List<BusinessLine> getAllBusinessLines();

    /**
     * Dao层，更新指定业务线信息
     * @param query BusinessLineQuery实例
     */
    Integer updateBusinessLineInfo(BusinessLineQuery query);

    /**
     * Dao层，删除指定业务线信息
     * @param id 业务线对应Id
     */
    void deleteBusinessLineInfoById(Integer id);
}

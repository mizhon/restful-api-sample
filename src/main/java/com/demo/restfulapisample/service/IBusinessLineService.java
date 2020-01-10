package com.demo.restfulapisample.service;

import com.demo.restfulapisample.entity.BusinessLine;
import com.demo.restfulapisample.entity.query.BusinessLineQuery;

import java.util.List;

/**
 * @author ming
 */
public interface IBusinessLineService {

    /**
     * 插入业务线相关数据
     *
     * @param businessLine 业务线实例
     * @return 返回更新条数
     */
    Integer addBusinessLineInfo(BusinessLine businessLine);

    /**
     * 根据businessLineId修改数据
     *
     * @param query BusinessLineQuery实例
     * @return 返回更新条数
     */
    Integer updateBusinessLineInfo(BusinessLineQuery query);

    /**
     * 根据businessLineId删除数据
     *
     * @param id BusinessLine的ID
     */
    void deleteBusinessLineInfoById(Integer id);

    /**
     * 获取所有业务线信息
     *
     * @return 返回业务线信息列表
     */
    List<BusinessLine> getAllBusinessLines();
}

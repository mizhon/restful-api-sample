package com.demo.restfulapisample.service.Impl;

import com.demo.restfulapisample.dao.ApiPerfDao;
import com.demo.restfulapisample.entity.ApiPerfDetail;
import com.demo.restfulapisample.entity.query.ApiPerfDetailQuery;
import com.demo.restfulapisample.service.IApiPerfService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ming
 */
@Service
public class ApiPerfServiceImpl implements IApiPerfService {

    @Autowired
    private ApiPerfDao apiPerfDao;

    @Override
    public void addApiPerfDetail(ApiPerfDetail details) {
        apiPerfDao.insertApiPerfDetail(details);
    }

    @Override
    public Integer batchAddApiPerfDetails(List<ApiPerfDetail> apiPerfDetails) {
        return apiPerfDao.batchInsertApiPerfDetails(apiPerfDetails);
    }

    @Override
    public PageInfo<ApiPerfDetail> getApiPerfDetails(ApiPerfDetailQuery query, Integer pageNum, Integer pageSize) {
        return null;
    }
}

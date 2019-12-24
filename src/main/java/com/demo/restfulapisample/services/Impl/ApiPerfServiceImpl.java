package com.demo.restfulapisample.services.Impl;

import com.demo.restfulapisample.dao.ApiPerfDao;
import com.demo.restfulapisample.entities.ApiPerfDetails;
import com.demo.restfulapisample.services.IApiPerfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ming
 */
@Service
public class ApiPerfServiceImpl implements IApiPerfService {

    @Autowired
    private ApiPerfDao apiPerfDao;

    @Override
    public void addPerfDetails(ApiPerfDetails details) {
        apiPerfDao.insert(details);
    }
}

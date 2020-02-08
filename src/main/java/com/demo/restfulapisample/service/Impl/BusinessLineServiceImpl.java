package com.demo.restfulapisample.service.Impl;

import com.demo.restfulapisample.dao.BusinessLineDao;
import com.demo.restfulapisample.entity.BusinessLine;
import com.demo.restfulapisample.entity.query.BusinessLineQuery;
import com.demo.restfulapisample.service.IBusinessLineService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ming
 */
public class BusinessLineServiceImpl implements IBusinessLineService {

    @Autowired
    private BusinessLineDao businessLineDao;


    @Override
    public List<BusinessLine> getAllBusinessLines() {
        return businessLineDao.getAllBusinessLines();
    }

    @Override
    public Integer addBusinessLineInfo(BusinessLine businessLine) {
        return businessLineDao.insertBusinessLineInfo(businessLine);
    }

    @Override
    public Integer updateBusinessLineInfo(BusinessLineQuery query) {
        return businessLineDao.updateBusinessLineInfo(query);
    }

    @Override
    public void deleteBusinessLineInfoById(Integer id) {
        businessLineDao.deleteBusinessLineInfoById(id);
    }
}

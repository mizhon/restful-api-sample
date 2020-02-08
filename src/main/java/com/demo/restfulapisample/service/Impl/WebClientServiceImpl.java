package com.demo.restfulapisample.service.Impl;

import com.demo.restfulapisample.dao.WebClientDao;
import com.demo.restfulapisample.entity.WebClient;
import com.demo.restfulapisample.service.IWebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ming
 */
@Service
public class WebClientServiceImpl implements IWebClientService {

    @Autowired
    private WebClientDao webClientDao;

    @Override
    public List<WebClient> getAllWebClients() {
        return webClientDao.getAllWebClients();
    }

    @Override
    public Integer addWebClientInfo(WebClient webClient) {
        return webClientDao.insertWebClientInfo(webClient);
    }

    @Override
    public Integer updateWebClientInfo(WebClient webClient) {
        return webClientDao.updateWebClientInfo(webClient);
    }
}

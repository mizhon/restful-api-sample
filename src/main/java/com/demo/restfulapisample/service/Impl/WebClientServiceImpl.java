package com.demo.restfulapisample.service.Impl;

import com.demo.restfulapisample.entity.WebClient;
import com.demo.restfulapisample.service.IWebClientService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ming
 */
@Service
public class WebClientServiceImpl implements IWebClientService {

    @Override
    public List<WebClient> getAllWebClients() {
        return null;
    }

    @Override
    public Integer addWebClientInfo(WebClient webClient) {
        return null;
    }

    @Override
    public Integer updateWebClientInfo(WebClient webClient) {
        return null;
    }
}

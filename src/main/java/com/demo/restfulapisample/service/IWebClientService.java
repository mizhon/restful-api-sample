package com.demo.restfulapisample.service;

import com.demo.restfulapisample.entity.WebClient;

import java.util.List;

/**
 * @author ming
 */
public interface IWebClientService {
    /**
     * 获取WebClients列表
     * @return 返回WebClinet列表
     */
    List<WebClient> getAllWebClients();

    /**
     * 添加WebClient信息
     * @param webClient 返回WebClient实例
     * @return 返回操作的数据条数
     */
    Integer addWebClientInfo(WebClient webClient);

    /**
     * 更新指定WebClient的信息
     * @param webClient 指定的WebClient实例，通常以id区分
     * @return 返回操作的数据条数
     */
    Integer updateWebClientInfo(WebClient webClient);
}

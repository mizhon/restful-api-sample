package com.demo.restfulapisample.dao;

import com.demo.restfulapisample.entity.WebClient;

import java.util.List;

/**
 * @author ming
 */
public interface WebClientDao {
    /**
     * Dao层，获取有效客户端列表
     * @return 返回客户端列表
     */
    List<WebClient> getAllWebClients();

    /**
     * Dao层，插入客户端信息
     * @param webClient WebClient实例
     * @return 返回被操作的数据条数
     */
    Integer insertWebClientInfo(WebClient webClient);

    /**
     * Dao层，修改客户端信息
     * @param webClient WebClient实例
     * @return 返回被操作的数据条数
     */
    Integer updateWebClientInfo(WebClient webClient);
}

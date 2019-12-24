package com.demo.restfulapisample.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ming
 */
public class ApiPerfDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 记录的Id */
    private int id;

    /** 客户端分类Id */
    private int clientId;

    /** 业务线Id */
    private int businessId;

    /** 域名 */
    private String domainName;

    /** URL地址 */
    private String url;

    /** 页面对应的路由信息 */
    private String routerPath;

    /** 发起请求的页面信息 */
    private String pageName;

    /** 页面加载耗时 */
    private double pageLoadTime;

    /** API请求所需时间 */
    private double apiDuration;

    /** TCP耗时 */
    private double tcpDuration;

    /** TTFB耗时 */
    private double ttfbDuration;

    /** DNS耗时 */
    private double dnsDuration;

    /** 创建性能数据的时间戳 */
    private Date createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRouterPath() {
        return routerPath;
    }

    public void setRouterPath(String routerPath) {
        this.routerPath = routerPath;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public double getPageLoadTime() {
        return pageLoadTime;
    }

    public void setPageLoadTime(double pageLoadTime) {
        this.pageLoadTime = pageLoadTime;
    }

    public double getApiDuration() {
        return apiDuration;
    }

    public void setApiDuration(double apiDuration) {
        this.apiDuration = apiDuration;
    }

    public double getTcpDuration() {
        return tcpDuration;
    }

    public void setTcpDuration(double tcpDuration) {
        this.tcpDuration = tcpDuration;
    }

    public double getTtfbDuration() {
        return ttfbDuration;
    }

    public void setTtfbDuration(double ttfbDuration) {
        this.ttfbDuration = ttfbDuration;
    }

    public double getDnsDuration() {
        return dnsDuration;
    }

    public void setDnsDuration(double dnsDuration) {
        this.dnsDuration = dnsDuration;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

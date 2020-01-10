package com.demo.restfulapisample.entity.query;

public class ApiPerfDetailQuery {
    /** 用户UID */
    private Long uid;

    /** 客户端设备ID */
    private String deviceId;

    /** 网络类型（Wifi | 4G | Other） */
    private String networkType;

    /** 客户端ID */
    private Integer clientId;

    /** 业务线ID */
    private Integer businessId;

    /** 域名信息 */
    private String domainName;

    /** URL地址 */
    private String url;

    /** 路由信息 */
    private String routerPath;

    /** 接口是否报错 */
    private Boolean hasError;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
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

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }
}

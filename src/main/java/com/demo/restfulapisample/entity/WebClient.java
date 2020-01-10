package com.demo.restfulapisample.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ming
 */
public class WebClient implements Serializable {
    /**
     * 客户端Id
     */
    private Integer id;

    /**
     * 客户端名称，包括：PC、H5、WeChat、Weex、Android、iOS、Flutter等
     */
    private String clientName;

    /**
     * 客户端描述
     */
    private String clientDesc;

    /**
     * 激活状态
     */
    private Boolean active;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientDesc() {
        return clientDesc;
    }

    public void setClientDesc(String clientDesc) {
        this.clientDesc = clientDesc;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}

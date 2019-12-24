package com.demo.restfulapisample.entities;

import java.io.Serializable;

/**
 * @author ming
 */
public class BusinessClients implements Serializable {
    private static final long serialVersionUID = 2L;

    /** 业务线记录的Id */
    private int id;

    /** 业务线记录对应code码，例如：tech、hr等 */
    private String businessCode;

    /** 业务线记录名称，例如：技术部、人力资源部、产品部 */
    private String businessName;

    /** 业务线描述、介绍 */
    private String businessDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }
}

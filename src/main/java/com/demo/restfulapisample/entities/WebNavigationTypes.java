package com.demo.restfulapisample.entities;

import java.io.Serializable;

/**
 * @author ming
 */
public class WebNavigationTypes implements Serializable {
    private static final long serialVersionUID = 4L;

    /** 记录的Navigation的Id */
    private int id;

    /** Navigation的类型 */
    private String navigationType;

    /** Navigation的描述 */
    private String navigationDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType;
    }

    public String getNavigationDesc() {
        return navigationDesc;
    }

    public void setNavigationDesc(String navigationDesc) {
        this.navigationDesc = navigationDesc;
    }
}

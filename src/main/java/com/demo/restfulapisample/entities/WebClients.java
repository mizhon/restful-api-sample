package com.demo.restfulapisample.entities;

import java.io.Serializable;

/**
 * @author ming
 */
public class WebClients implements Serializable {
    private static final long serialVersionUID = 3L;

    /** Web端类型ID */
    private int id;

    /** Web端名称：PC/H5/WeChat(微信)/Weex/Android/iOS/Flutter等 */
    private String clientName;

    /** Web端描述 */
    private String clientDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}

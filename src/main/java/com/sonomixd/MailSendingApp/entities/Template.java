package com.sonomixd.MailSendingApp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "template")
public class Template implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "template_key")
    private String key;

    @Column(name = "data")
    private byte[] data;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}

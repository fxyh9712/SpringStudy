package com.fxyh;

import java.io.Serializable;

public class ImportXMLDemo implements Serializable {
    private static final long serialVersionUID = 4498893717870450845L;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ImportXMLDemo{" +
                "username='" + username + '\'' +
                '}';
    }
}

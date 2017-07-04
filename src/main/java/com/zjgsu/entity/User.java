package com.zjgsu.entity;

import java.io.Serializable;

/**
 * Created by zby on 2017/6/28.
 */
public class User implements Serializable {
    private String loginname;
    private String password;
    private String username;

    public User() {
        super();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

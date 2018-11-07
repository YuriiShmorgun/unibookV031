package com.unibook.model.entity;

import javax.persistence.Entity;


public class Security {

    private String login;
    private String password;

    public Security(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

package com.unibook.model.entity.newEntity;

import javax.persistence.Entity;


public class SecurityEntity {

    private String login;
    private String password;

    public SecurityEntity(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

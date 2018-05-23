/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.shop.entity;

/**
 *
 * @author user
 */
public class User {
    private int id;
    private String userName, password, email;
    private boolean status;

    public User() {
    }

    public User(int id, String userName, String password, String email, boolean status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public boolean isStatus() {
        return status;
    }

    public User setStatus(boolean status) {
        this.status = status;
        return this;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.shop.dao;

import com.heroku.web.shop.entity.User;
import java.util.List;

/**
 *
 * @author user
 */
public interface UserDAO {
    List<User> getAll();
    int insert(User user);
//    User login(String userName, String password);
//    boolean delete(int userId);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/home")
public class DefaultController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "Shop Project");

        String sql = "Create table users(id serial primary key, "
                + "username varchar(50), password varchar(50), "
                + "email varchar(50), added_date timestamp "
                + "default current_timestamp, status boolean)";
        int result = jdbcTemplate.update(sql);
        System.out.println("Query Execution result: "+result);
        return "index";
    }
}

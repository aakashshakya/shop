/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.shop.controller;

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
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("name", "Shop Project");
        return "index";
    }
}

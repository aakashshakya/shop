/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.shop;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author user
 */
@Configuration
public class AppConfigurer {

    @Bean
    public DataSource getDataSource() {
        String url = "jdbc:postgresql://ec2-23-23-248-192.compute-1.amazonaws.com/ddeag5fhdhgbhg?sslmode=require";
        String user = "iylykcbsieagnj";
        String password = "980134bac49485a9d50b75b81535887b163cff67c450f57534881b9ee45461d5";
        DataSource dataSource = new DriverManagerDataSource(url, user, password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate getJdbctemplate() {
        return new JdbcTemplate(getDataSource());
    }
}

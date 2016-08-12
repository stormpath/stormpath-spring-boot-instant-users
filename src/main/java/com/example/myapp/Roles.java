package com.example.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Roles {

    @Value("${roles.admin}") //defined in application.properties
    public String admin;

}

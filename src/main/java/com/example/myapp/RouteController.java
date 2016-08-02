package com.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/")
    String home() {
        return "home";
    }

    @RequestMapping("/restricted")
    String restricted() {
        return "restricted";
    }

    @RequestMapping("/admin")
    String admin() {
        adminService.sendRevenueReports();
        return "admin";
    }
}
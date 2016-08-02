package com.example.myapp;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public boolean sendRevenueReports() {
        System.out.println("Revenue reports sent!");
        return true;
    }
}

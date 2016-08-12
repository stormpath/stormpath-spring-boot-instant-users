package com.example.myapp;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @PreAuthorize("hasAuthority(@roles.admin)") //references the 'roles' bean's 'admin' field
    public boolean sendRevenueReports() {
        System.out.println("Revenue reports sent!");
        return true;
    }
}

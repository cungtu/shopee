package com.revise.shopee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String getUserPage() {
        return "<H1>User</H1>";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "<H1>ADMIN</H1>";
    }
}

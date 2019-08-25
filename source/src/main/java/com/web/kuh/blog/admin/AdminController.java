package com.web.kuh.blog.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = {"", "/"})
    public String page(){
        return "admin/page";
    }
}

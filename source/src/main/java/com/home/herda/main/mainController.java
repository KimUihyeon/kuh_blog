package com.home.herda.main;


import oracle.jdbc.proxy.annotation.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {


    @RequestMapping(value = {"/","","home","/main/home",}, method = {RequestMethod.GET, RequestMethod.POST})
    public String page(){

        return "index";
    }
}

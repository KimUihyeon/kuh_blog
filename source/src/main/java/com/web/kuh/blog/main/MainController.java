package com.web.kuh.blog.main;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
public class MainController {

    @RequestMapping(value = {"/", "/main"})
    public String test(){

        return "main/page";
    }

    @RequestMapping(value = "/errorTest")
    public String error (@RequestParam Map<String,Object> reqMap, Model model) throws Exception{

        System.out.println("errror Test");

        throw new NullPointerException("test");

    }


    @RequestMapping(value = "/paramTest")
    public String paramTest (@RequestParam Map<String, Object> req, Model model) throws Exception{
        model.addAttribute("map",req);
        return "main/page";

    }
}

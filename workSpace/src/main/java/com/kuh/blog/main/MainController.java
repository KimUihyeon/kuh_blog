package com.kuh.blog.main;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"","main"})
public class MainController {


    @RequestMapping(value = {"/"})
    public String main(Model model){
        String url = "https://raw.githubusercontent.com/KimUihyeon/note/master/06_Dev%20Environment/README.md";
        Document doc = null;
        String innerHtml = "";

        try{
            doc =  Jsoup.connect(url).get();
            innerHtml = doc.text();
        }catch (Exception e){
            innerHtml = e.getMessage();
        }


        model.addAttribute("test",innerHtml);

        return "index";
    }
}

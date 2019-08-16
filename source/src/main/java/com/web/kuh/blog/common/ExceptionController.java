package com.web.kuh.blog.common;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public String commandExceptionHandle(Exception e, Model model){

        model.addAttribute("error",e);
        return "error/page";
    }


}

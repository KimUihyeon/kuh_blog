package com.web.kuh.blog.common;


import com.web.kuh.blog.common.service.CommonService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;

@ControllerAdvice
public class ExceptionController {

    @Resource( name = "commonService")
    private CommonService commonService;

    @ExceptionHandler
    public String commandExceptionHandle(Exception e, Model model){
        String errorMessage = null;
        try{
            //jsp ip Exception
            if(e.getMessage().equals("Could not open JPA EntityManager for transaction; nested exception is org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection")){
                errorMessage = "Hibernate JPA가 Databases연결에 실패하였습니다. \n 인가된 ip인지 확인해주세요.";
                errorMessage += "(ip-> "+commonService.getClientIP()+")";;
            }

        }
        catch (Exception innerException){}
        finally {
            model.addAttribute("error",e);
            model.addAttribute("errorMsg",errorMessage);
        }
        return "error/page";
    }


}

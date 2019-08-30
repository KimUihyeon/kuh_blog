package com.web.kuh.blog.admin;

import com.web.kuh.blog.admin.service.AdminMenuService;
import com.web.kuh.blog.admin.vo.AdminMenuVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Resource(name = "adminMenuService")
    private AdminMenuService adminMenuService;

    @RequestMapping(value = {"", "/"})
    public String page(){
        return "admin/dashboard";
    }


    @RequestMapping(value = "/menuList" , method = RequestMethod.POST)
    public @ResponseBody List<AdminMenuVo> adminMenu(@RequestParam Map<String, Object> req){
        return adminMenuService.listAll();
    }

}

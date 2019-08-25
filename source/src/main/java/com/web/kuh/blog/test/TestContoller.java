package com.web.kuh.blog.test;


import com.web.kuh.blog.board.service.BoardService;
import com.web.kuh.blog.common.service.FileService;
import com.web.kuh.blog.test.Service.ITestService;
import com.web.kuh.blog.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/test")
public class TestContoller {

    @Value("${blog.testpage.path}")
    private String testPageUrl;


    @Resource(name = "testService")
    private ITestService testService;

    @Resource(name = "fileService")
    private FileService fileService;

    @RequestMapping(value = "/")
    public String page(@RequestParam Map<String,Object> req){

        return "test/page";
    }

    @RequestMapping(value = "/reqMap")
    public String requestMapTest(@RequestParam Map<String,Object> req){

        return  testPageUrl;
    }

    @RequestMapping(value =  "/editTest")
    public String editPageTest(){
        return "test/edit";
    }

    @RequestMapping(value = "/edit")
    public String editSubmit(@RequestParam Map<String, Object> req){

        return "redirect:editTest";
    }

    @RequestMapping(value = "/toastEditor")
    public String edit2(){
        return "test/toastEditor";
    }


    @RequestMapping(value = "/hibernate")
    public String hibernateDomainTest(){
        List<TestVo> vo = testService.ListAll();
        return  testPageUrl;
    }

    @RequestMapping(value = "/jsonTest")
    public @ResponseBody Map<String, Object> jsonTest(@RequestParam Map<String, Object> req){
        Map<String, Object> map = new HashMap<>(req);
        return map;
    }

    @RequestMapping(value = "/fileUpload")
    public @ResponseBody Map<String, Object> fileUpload(@RequestParam Map<String,Object> req, HttpServletRequest request){
        return req;
    }
}

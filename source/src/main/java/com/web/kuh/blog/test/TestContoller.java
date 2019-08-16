package com.web.kuh.blog.test;


import com.web.kuh.blog.test.Service.ITestService;
import com.web.kuh.blog.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/test")
public class TestContoller {

    @Value("${blog.testpage.path}")
    private String testPageUrl;


    @Resource(name = "testService")
    private ITestService testService;


    @RequestMapping(value = "/reqMap")
    public String requestMapTest(@RequestParam Map<String,Object> req){

        return  testPageUrl;
    }


    @RequestMapping(value = "/hibernate")
    public String hibernateDomainTest(){
        List<TestVo> vo = testService.ListAll();
        return  testPageUrl;
    }
}

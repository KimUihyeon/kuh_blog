package com.web.kuh.blog.test.Service;

import com.web.kuh.blog.test.Repository.TestRepository;
import com.web.kuh.blog.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("testService")
public class TesService implements ITestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestVo> ListAll() {
        return (List<TestVo>) testRepository.findAll();
    }
}

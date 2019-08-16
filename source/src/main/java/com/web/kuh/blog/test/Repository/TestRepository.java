package com.web.kuh.blog.test.Repository;

import com.web.kuh.blog.test.vo.TestVo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

public interface TestRepository extends CrudRepository<TestVo, Long>{

}

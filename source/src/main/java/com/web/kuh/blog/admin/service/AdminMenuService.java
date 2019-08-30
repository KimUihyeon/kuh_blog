package com.web.kuh.blog.admin.service;

import com.web.kuh.blog.admin.repositories.IAdminMenuRepository;
import com.web.kuh.blog.admin.vo.AdminMenuVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("adminMenuService")
public class AdminMenuService {

    @Resource(name = "adminMenuRepository")
    private IAdminMenuRepository adminMenuRepository;


    public List<AdminMenuVo> listAll(){
        List<AdminMenuVo> datas = new ArrayList<>();
        Iterable<AdminMenuVo> iter =  adminMenuRepository.findAll();
        iter.forEach(datas::add);

        return datas;
    }
}

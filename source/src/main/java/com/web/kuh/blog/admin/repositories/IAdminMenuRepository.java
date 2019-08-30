package com.web.kuh.blog.admin.repositories;

import com.web.kuh.blog.admin.vo.AdminMenuVo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("adminMenuRepository")
public interface IAdminMenuRepository extends CrudRepository<AdminMenuVo, Integer> {
}

package com.web.kuh.blog.admin.vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "adminMenu")
public class AdminMenuVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Column(name = "id") int id;
    private @Column(name = "uiFlag") int uiFlag;
    private @Column(name = "url") String url;
    private @Column(name = "name") String name;
    private @Column(name = "isUsed") boolean isUsed;
}

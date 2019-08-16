package com.web.kuh.blog.test.vo;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="test")
public class TestVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Column( name = "id") int id;
    private @Column( name = "context") String context;


    public TestVo(){

    }

}

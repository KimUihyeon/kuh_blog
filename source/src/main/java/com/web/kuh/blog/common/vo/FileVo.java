package com.web.kuh.blog.common.vo;

import lombok.Data;

@Data
public class FileVo {

    private String fullName;
    private String name;
    private String ext;
    private String path;
    private byte[] size;

}

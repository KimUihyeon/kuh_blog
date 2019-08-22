package com.web.kuh.blog.common;


import com.web.kuh.blog.common.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "/file")
public class FileController {

    @Resource(name = "fileService")
    private FileService fileService;

    @RequestMapping(value = "/imageUpload")
    public @ResponseBody Map<String, Object> imageUpload(@RequestParam Map<String,Object> req,
                                                            HttpServletRequest request) throws Exception{

        Map<String, Object> map = null;

        String absPath = fileService.getUploadDirectoryPathPattern(
                                req.get("user_name").toString() ,
                                req.get("current_date").toString());

        if(fileService.createDirectory(absPath)){
            map = fileService.imageFileUpload(absPath,  (MultipartHttpServletRequest)request);
        }
        return map;
    }
}

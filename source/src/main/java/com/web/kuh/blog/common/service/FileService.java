package com.web.kuh.blog.common.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service(value = "fileService")
public class FileService {

    @Autowired
    private ServletContext servletContext;

    private static final String TOMCAT_DIRECTORY_PATH = System.getProperty("user.dir");

    public String getUploadAbsDirPath() {
        return getResourceDirPath() + "/upload";
    }

    public String getResourceDirPath(){
        return servletContext.getRealPath("/");
    }

    public String getServerRootDirPath(){
        return TOMCAT_DIRECTORY_PATH;
    }


    private String getUUID(){
        return UUID.randomUUID().toString();
    }


    public String getUploadDirectoryPathPattern(String userName, String date) throws Exception {


        SimpleDateFormat dataConverter = new SimpleDateFormat("yy-MM");
        String directoryDatePattern = null;

        try{
            Date tempDate= dataConverter.parse(date);
            directoryDatePattern = dataConverter.format(tempDate);
        }catch (Exception e){
            throw new Exception("getUploadDirectoryPathPattern -> 날짜 포맷 애러");
        }


        if(directoryDatePattern.isEmpty()){
            throw new Exception("getUploadDirectoryPathPattern -> 날짜 포맷 애러");
        }


        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(userName);
        sb.append("/");
        sb.append(directoryDatePattern);

        return sb.toString();
    }

    public boolean createDirectory(String absPath){
        String path = getUploadAbsDirPath() + absPath;
        try{
            File directory = new File(path);
            directory.mkdirs();
            if(directory.exists()){
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Map<String, Object> imageFileUpload(String absPath ,MultipartHttpServletRequest multipartRequest) throws Exception {

        Map<String, Object> map = new HashMap<>();
//        List<FileVo> fileList  = new ArrayList<>();
        Iterator iter =  multipartRequest.getFileNames();

        try{

            while (iter.hasNext()){

                String fileType = (String)iter.next();
                MultipartFile multipartFile =  multipartRequest.getFile(fileType);
                String fileFullName = multipartFile.getOriginalFilename();


                if(!fileType.equals("image")){
                    map.put("error", fileFullName + "이미지가 아닙니다.");
                    break;
                }

                String saveFileAbsPath = absPath + "/" + getUUID() + "_~_" + fileFullName;

                File file = new File( getUploadAbsDirPath() , saveFileAbsPath);
                multipartFile.transferTo(file);
//
//                FileVo fileVo = new FileVo();
//                fileVo.setPath(saveFileAbsPath);
//                fileList.add(fileVo);
            }

        }catch (Exception e){

            throw new Exception(e);
        }
        finally {
//            map.put("fileList",fileList);
        }
        return map;
    }
}

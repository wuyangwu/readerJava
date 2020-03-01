package com.example.reader.web.util;

import org.apache.commons.io.FilenameUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/12 18:54
 */
//CESHI
@RestController
public class FileUpload {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
    private String fomartDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    private final String UPLOAD_PATH = "/image/";
    private final Integer SUCCESS = 1;
    private final Integer FAILURE = 0;

    private File getRootPath(){
        //System.getProperty("user.dir")获取当前项目根目录
        File file = new File(System.getProperty("user.dir")+UPLOAD_PATH);
        if(!file.exists()){//如果文件夹不存在
            file.mkdirs();//创建文件夹
        }
        String rootPath = file.getAbsolutePath();
        System.out.println("wenjian"+rootPath);
        File folder = new File(rootPath+'/' + fomartDate);
        if (!folder.isDirectory()){
            folder.mkdirs();
        }
        return folder;
    }
//    private Logger logger = LoggerFactory.getLogger(getClass());

    /*
     * 单文件上传
     * */
//    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request) {
//        ModelMap map = new ModelMap();
        if (uploadFile == null){
//            map.addAttribute("status",FAILURE);
//            map.addAttribute("message","未选择文件");
            return "未选择文件";
        }
        File folder = getRootPath();
//        logger.debug("文件夹路径:"+folder.getAbsolutePath())；
        System.out.println(folder.getAbsolutePath());
        String originalFilename = uploadFile.getOriginalFilename();
//        logger.debug("文件原名："+originalFilename);
        String newName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        try {
            uploadFile.transferTo(new File(folder,newName));
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + UPLOAD_PATH + fomartDate+"/" + newName;
//            logger.debug("文件访问路径："+filePath);
            System.out.println(filePath);
//            map.addAttribute("filePath",filePath);
//            map.addAttribute("status",SUCCESS);
            return "filePath";
        } catch (IOException e) {
            e.printStackTrace();
        }
//        map.addAttribute("status",FAILURE);
        return "FAILURE";
    }

//    @PostMapping("/uploads")
    public String uploads(MultipartFile file , HttpServletRequest httpServletRequest){
        System.out.println(httpServletRequest.getSession().getServletContext().getRealPath("/upload/File"));
        System.out.println(file.getOriginalFilename());
        File file1 = new File(file.getOriginalFilename());
//        System.out.println(file.);
//        return file.getContentType();
        String filename = file.getOriginalFilename();
//        String realpath = "D:/img/" +  module +"/";
        String realpath = "module/";
        File fileDir = new File(realpath);
        if (!fileDir.exists())
            fileDir.mkdirs();

        String extname = FilenameUtils.getExtension(filename);
        String allowImgFormat = "gif,jpg,jpeg,png";
        if (!allowImgFormat.contains(extname.toLowerCase())) {
            return "NOT_IMAGE";
        }

        filename = Math.abs(file.getOriginalFilename().hashCode()) + RandomUtils.createRandomString( 4 ) + "." + extname;
        InputStream input = null;
        FileOutputStream fos = null;
        try {
            input = file.getInputStream();
            fos = new FileOutputStream(realpath + "/" + filename);
            IOUtils.copy(input, fos);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            IOUtils.closeQuietly(input);
            IOUtils.closeQuietly(fos);
        }
        return "/" + filename;
    }
}

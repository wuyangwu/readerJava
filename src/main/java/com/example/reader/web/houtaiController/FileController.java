package com.example.reader.web.houtaiController;

import com.example.reader.config.WebMvcConfig.ServerConfig;
import com.example.reader.web.util.FileUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/1 11:35
 */

@RestController
@RequestMapping("/file")
public class FileController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
    private String fomartDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    @Autowired
    private ServerConfig serverConfig;

    @RequestMapping("/updateimgae")
    public String  imgaefile(@RequestParam(value = "file") MultipartFile file) {
        String url = FileUrl.BookImageurlPath;
        String filename = file.getOriginalFilename(); // 文件名
        String suffixName = filename.substring(filename.lastIndexOf(".")); // 后缀名
        filename = UUID.randomUUID() + suffixName;
        String  newFileUrl = String.format("%s\\%s",url,filename);
        logger.info("图片存储位置 ={}",newFileUrl);
        File files = new File(newFileUrl);
        if (!files.getParentFile().exists()){
            files.mkdirs(); //为什么用mkdirs()呢？因为这个方法可以在不知道偶没有父类文件夹的情况下，创建文件夹，而mkdir（）必须在有父类的文件夹下创建文件
        }
        try {
            file.transferTo(files);
        } catch (IOException e) {
//            e.printStackTrace();
            logger.info("文件保存失败错误是 ={}", e);
        }
        String shouimage = serverConfig.getUrl()+"/img/bookimage/"+filename;
        logger.info("图片访问地址 = {}", shouimage);
        return shouimage;
    }

    @RequestMapping("/updatefile")
    public Map<String, String>  file(@RequestParam(value = "file") MultipartFile file) {
        String url = FileUrl.BookUrlPath;
        String filename = file.getOriginalFilename(); // 文件名
        String filenames = filename;
        String suffixName = filename.substring(filename.lastIndexOf(".")); // 后缀名
        filename = UUID.randomUUID() + suffixName;
        String newFileUrl = String.format("%s\\%s",url,filename);
        logger.info("文件存储位置 = {}",newFileUrl);
        File files = new File(newFileUrl);
        if (!files.getParentFile().exists()){
            files.mkdirs();
        }
        try{
            file.transferTo(files);
        } catch (IOException e){
            logger.warn("文件保存失败错误是 ={}", e);
        }
        String shouFile = serverConfig.getUrl()+"/img/book/"+filename;
        logger.info("书籍访问路径地址 = {}", shouFile);
        Map<String,String> map = new HashMap<>();
        map.put("name",filenames);
        map.put("url",shouFile);
        return map;
    }
}

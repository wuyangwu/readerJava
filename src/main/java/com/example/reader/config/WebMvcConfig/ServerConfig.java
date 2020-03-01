package com.example.reader.config.WebMvcConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/1 13:20
 */
@Component
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {

    protected Logger logger = LoggerFactory.getLogger(getClass());
    private int serverPort;

    public String getUrl() {
        InetAddress address = null;
        try{
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e){
            logger.warn("获取ip地址出现问题");
        }
//        return  "http://" +address.getHostAddress() + ":"+this.serverPort;
        return  "http://127.0.0.1" + ":"+this.serverPort;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        this.serverPort = webServerInitializedEvent.getWebServer().getPort();
    }
}

package com.stackroute.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MusicApplication {


    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class,args);
    }


}
@RefreshScope
@RestController
class MuzixRestController
{
    @Value("${msg:Hello World-Config Server is not working...please check}")
    private String msg;

    @RequestMapping("/msg")
    String getMsg()
    {
        return this.msg;
    }
}

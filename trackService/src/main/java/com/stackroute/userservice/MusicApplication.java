package com.stackroute.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@EnableEurekaClient
@SpringBootApplication
public class MusicApplication {


    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class,args);
        System.out.println();
    }

}
@RefreshScope
@RestController
class MsgRestController
{
    @Value("${msg:Hello}")
    private String msg;

    @RequestMapping("/msg")
    String getMsg()
    {
        return this.msg;
    }


}
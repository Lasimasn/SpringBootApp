package com.stackroute.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableEurekaClient
@SpringBootApplication
public class MusicApplication {


    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class,args);
        System.out.println();
    }


}

package com.pkest.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wuzhonggui on 2018/3/1.
 * QQ: 2731429978
 * Email: pk8est@qq.com
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        //new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }

}

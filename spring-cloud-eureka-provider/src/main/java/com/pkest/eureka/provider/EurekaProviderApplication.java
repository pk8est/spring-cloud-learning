package com.pkest.eureka.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuzhonggui on 2018/3/1.
 * QQ: 2731429978
 * Email: pk8est@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class EurekaProviderApplication {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/home")
    public String home() {
        logger.debug(Long.toString(System.currentTimeMillis()));
        return "EurekaProviderApplication";
    }

    public static void main(String[] args) {
        //new SpringApplicationBuilder(ClientBootstrap.class).web(true).run(args);
        SpringApplication.run(EurekaProviderApplication.class, args);
    }
}

package com.pkest.eureka.consumer.feignclient;

import com.pkest.eureka.consumer.feignclient.hystrix.ProviderFeignClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wuzhonggui on 2018/3/2.
 * QQ: 2731429978
 * Email: pk8est@qq.com
 */
@FeignClient(value= "${provider.server_1.name}", fallback = ProviderFeignClientHystrix.class)
public interface ProviderFeignClient {

    @RequestMapping(value = "/api/info", method = RequestMethod.GET)
    String info();

}

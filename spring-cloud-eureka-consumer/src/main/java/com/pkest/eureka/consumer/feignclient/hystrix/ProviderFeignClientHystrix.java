package com.pkest.eureka.consumer.feignclient.hystrix;

import com.pkest.eureka.consumer.feignclient.ProviderFeignClient;
import org.springframework.stereotype.Component;

/**
 * Created by wuzhonggui on 2018/3/2.
 * QQ: 2731429978
 * Email: pk8est@qq.com
 */
@Component
public class ProviderFeignClientHystrix implements ProviderFeignClient {

    @Override
    public String info() {
        return "调用ProviderFeignClient服务失败";
    }
}

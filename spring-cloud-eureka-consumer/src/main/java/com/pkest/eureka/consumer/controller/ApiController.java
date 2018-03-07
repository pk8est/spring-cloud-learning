package com.pkest.eureka.consumer.controller;

import com.pkest.eureka.consumer.feignclient.ProviderFeignClient;
import com.pkest.module.common.util.JsonOutputUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuzhonggui on 2018/3/2.
 * QQ: 2731429978
 * Email: pk8est@qq.com
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected ProviderFeignClient providerFeignClient;

    @RequestMapping("/info")
    public String info(HttpServletRequest request) {
        Map<String, Object> data = new HashMap();
        data.put("app", "EurekaConsumerApplication");
        data.put("desc", "This is api page!");
        data.put("time", System.currentTimeMillis());
        data.put("providerInfo", providerFeignClient.info());
        logger.debug("{}", data);
        logger.info("===<call trace-2, TraceId={}, SpanId={}>===",
                request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return JsonOutputUtils.output(data);
    }

}

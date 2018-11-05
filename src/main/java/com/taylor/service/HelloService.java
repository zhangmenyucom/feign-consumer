package com.taylor.service;/**
 * ${author} on 2018/11/5.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangxiaolu
 * @描述
 * @since 2018/11/5 19:04
 */
@FeignClient("eureka-client")
public interface HelloService {
    @RequestMapping("/hello/say")
    String hello();
}

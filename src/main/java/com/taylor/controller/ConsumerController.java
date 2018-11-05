package com.taylor.controller;/**
 * ${author} on 2018/11/5.
 */

import com.taylor.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaolu
 * @描述
 * @since 2018/11/5 19:07
 */
@RestController
@RequestMapping("hello")
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/feign-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }
}

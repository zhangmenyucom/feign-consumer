package com.taylor;/**
 * ${author} on 2018/11/5.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhangxiaolu
 * @描述
 * @since 2018/11/5 18:56
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

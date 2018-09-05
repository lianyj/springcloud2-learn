package com.springcloud2.learn.learneurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LearnEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaClient2Application.class, args);
    }
}

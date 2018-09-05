package com.springcloud2.learn.learneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaServerApplication.class, args);
    }
}

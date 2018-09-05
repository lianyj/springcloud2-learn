package com.springcloud2.learn.learneurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LearnEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnEurekaClientApplication.class, args);
	}
}

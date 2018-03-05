package com.example.springcluoddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka启动类
 * @EnableEurekaServer eureka服务器启动注解
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringcluodDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcluodDemoApplication.class, args);
	}
}

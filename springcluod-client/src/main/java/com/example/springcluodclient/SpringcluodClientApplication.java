package com.example.springcluodclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创造一个服务提供者 eureka client
 * @EnableEurekaClient 注解表示为一个服务提供者
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringcluodClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcluodClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am from port:" +port;
	}
}

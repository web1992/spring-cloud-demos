package com.gbdfn.springcloud.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemosApplication.class, args);
	}

}

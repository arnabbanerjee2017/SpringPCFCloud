package com.arnab.spring.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringPcfEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPcfEurekaClientApplication.class, args);
	}

}

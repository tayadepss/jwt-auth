package com.jwt.deptservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JwtDeptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDeptServiceApplication.class, args);
	}

}

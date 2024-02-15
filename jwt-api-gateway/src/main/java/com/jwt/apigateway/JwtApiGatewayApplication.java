package com.jwt.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JwtApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApiGatewayApplication.class, args);
	}

}

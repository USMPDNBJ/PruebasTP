package com.microservice.gateway2.microservice_gateway2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceGateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGateway2Application.class, args);
	}

}

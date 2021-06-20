package com.techacademy.esm.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EsmDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsmDiscoveryServerApplication.class, args);
	}

}

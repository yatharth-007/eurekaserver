package com.project.pet_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PetEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetEurekaServerApplication.class, args);
	}

}

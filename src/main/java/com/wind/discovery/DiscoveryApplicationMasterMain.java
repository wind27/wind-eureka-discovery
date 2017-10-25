package com.wind.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplicationMasterMain {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplicationMasterMain.class, args);
	}
}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PluralsightSpringcloudM2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM2ConfigServerApplication.class, args);
	}
}

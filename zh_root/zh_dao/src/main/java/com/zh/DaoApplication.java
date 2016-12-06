package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DaoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DaoApplication.class, args);
	}

}

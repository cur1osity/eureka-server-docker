package com.cur1osity.task2restapieurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Task2restapieurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task2restapieurekaserverApplication.class, args);
	}
}

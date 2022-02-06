package com.legato.clentserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClentServerApplication.class, args);
	}

}

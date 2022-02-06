package com.legato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstServiceAppApplication.class, args);
	}

}

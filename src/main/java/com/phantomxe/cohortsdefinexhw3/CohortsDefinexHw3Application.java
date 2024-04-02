package com.phantomxe.cohortsdefinexhw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CohortsDefinexHw3Application {

	public static void main(String[] args) {
		SpringApplication.run(CohortsDefinexHw3Application.class, args);
	}

}

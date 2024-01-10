package com;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzserverApplication {

	public static Map<String,Integer> requestLoggerWithParameter = new HashMap<>();
	
	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzserverApplication.class, args);
	}

}

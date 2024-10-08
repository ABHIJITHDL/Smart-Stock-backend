package com.dbms.smartstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SmartstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartstockApplication.class, args);
	}

}

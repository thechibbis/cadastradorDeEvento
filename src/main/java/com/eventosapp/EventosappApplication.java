package com.eventosapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EventosappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventosappApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}
}

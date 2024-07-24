package com.cricket.apis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketPulseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CricketPulseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Project started..");
	}
}

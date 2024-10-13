package com.example.gauri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GauriApplication {

	public static void main(String[] args) {
		SpringApplication.run(GauriApplication.class, args);
		System.out.println("Welcome to Docker");
	}

}

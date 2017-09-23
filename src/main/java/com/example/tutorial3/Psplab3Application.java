package com.example.tutorial3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.tutorial3")
@SpringBootApplication
public class Psplab3Application {

	public static void main(String[] args) {
		SpringApplication.run(Psplab3Application.class, args);
	}
}

package com.jeuCarte.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
"com.example.something", "com.example.application"})
@ComponentScan(basePackages={"com.jeuCarte.demo.controller","com.jeuCarte.demo.service","com.jeuCarte.demo.repository"})
public class SpringCarte1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCarte1Application.class, args);
	}

}

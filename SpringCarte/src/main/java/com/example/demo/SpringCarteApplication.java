package com.example.demo;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.example.demo.entities.Carte;
import com.example.demo.repository.CarteRepository;
import com.example.demo.service.CarteService;



@SpringBootApplication(scanBasePackages={
"com.example.something", "com.example.application"})
@ComponentScan(basePackages={"com.example.demo.controller","com.example.demo.service","com.exapmle.demo.repository"})

public class SpringCarteApplication {

	public static void main(String[] args) {
		 System.out.println( "Hello World! ines " );
		
		SpringApplication.run(SpringCarteApplication.class, args);
	}
		
		@Bean
	    public CommandLineRunner demo(CarteService carteService) {
			return (args) -> {
				  System.out.println( "Hello World! ines  createListCarte" );
				  carteService.createListCarte();
	};
	
		
		}	
		@Bean
	    public ViewResolver viewResolver() {
	         final InternalResourceViewResolver r = new InternalResourceViewResolver();
	         r.setPrefix("/WEB-INF/jsp/");
	         r.setSuffix(".jsp");
	         return r;
	    }
}

package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration 
@SpringBootApplication
@ComponentScan(basePackages="spittr")
public class Application {

	
	public static void main(String[] args) {
SpringApplication.run(Application.class, args);
	
	
	}
}

package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@SpringBootApplication
@ComponentScan("spittr")
public class Application {

	
	public static void main(String[] args) {
SpringApplication.run(Application.class, args);
	
	
	}
}

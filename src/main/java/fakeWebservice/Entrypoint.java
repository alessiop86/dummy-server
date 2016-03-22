package fakeWebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
 
@ComponentScan
@EnableAutoConfiguration
public class Entrypoint {
 
	public static void main(String[] args) {
		SpringApplication.run(Entrypoint.class, args);
	}
 
}
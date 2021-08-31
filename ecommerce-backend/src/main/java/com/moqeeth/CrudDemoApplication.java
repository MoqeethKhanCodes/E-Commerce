package com.moqeeth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CrudDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {		
		return builder.sources(CrudDemoApplication.class);
	}

}

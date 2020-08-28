package com.hcl.reviewtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ReviewtoolApplication extends SpringBootServletInitializer {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ReviewtoolApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(ReviewtoolApplication.class, args);
	}

}

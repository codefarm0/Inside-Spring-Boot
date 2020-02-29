package com.greenlearner.springbootbanner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootbannerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootbannerApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);

	}



}

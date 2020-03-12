package com.greenlearner.springbootbanner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbannerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringbootbannerApplication.class);
        //springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }


}

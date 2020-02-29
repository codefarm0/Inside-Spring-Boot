package com.greenlearner.springbootbanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */

@Configuration
@Order(2)
public class Hello implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("demo");
    }
}

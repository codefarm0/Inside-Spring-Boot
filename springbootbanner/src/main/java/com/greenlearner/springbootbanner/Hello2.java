package com.greenlearner.springbootbanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */

@Configuration
@Order(1)
public class Hello2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("demo2");
    }
}

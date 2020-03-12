package com.gl.failureanalyzerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FailureAnalyzerDemoApplication {

    //@Autowired
    HelloDear helloDear;

    public static void main(String[] args) {
        SpringApplication.run(FailureAnalyzerDemoApplication.class, args);
    }


}

package com.codefarm.secureconfigdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureconfigdemoApplication implements CommandLineRunner {

	@Value("${codefarm.secret.password}")
	private String password;
	@Value("${codefarm.secret.username}")
	private String username;
	@Value("${codefarm.secret.email}")
	private String email;

	public static void main(String[] args) {
		SpringApplication.run(SecureconfigdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("User name --> " + this.username);
		System.out.println("password --> " + this.password);
		System.out.println("email --> " + this.email);
	}
}

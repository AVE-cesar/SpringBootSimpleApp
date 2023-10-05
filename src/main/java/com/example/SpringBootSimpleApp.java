package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleApp implements CommandLineRunner {

	private final static Logger logger = LoggerFactory.getLogger(SpringBootSimpleApp.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info("Let's play !!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleApp.class, args);
	}
}

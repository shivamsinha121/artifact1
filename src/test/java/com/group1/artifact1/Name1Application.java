package com.group1.artifact1;
import jakarta.annotation.PostConstruct;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Name1Application {
	public static Logger logger= (Logger) LoggerFactory.getLogger(Name1Application.class);
	@PostConstruct
	public void init(){
		logger.info("application started...");
	}
	public static void main(String[] args) {
		SpringApplication.run(Name1Application.class, args);
	}
}

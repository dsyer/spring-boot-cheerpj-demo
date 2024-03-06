package com.example.commandlinerunner;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CLR implements CommandLineRunner {

	private static final Log logger = LogFactory.getLog(SpringApplication.class);

	private static final Random random = new SecureRandom();

	public CLR(ConfigurableApplicationContext context) {
		ConfigurableApplicationContext context1 = context;
		Arrays.stream(context1.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
	}

	@Override
	public void run(String... args) throws Exception {
		int i = 0;
		System.out.println("commandlinerunner running! " + (i++) + " " + random.nextDouble());
		logger.trace("WARNING log message " + (i++) + " " + random.nextDouble());
		logger.debug("DEBUG log message " + (i++) + " " + random.nextDouble());
		logger.info("INFO log message " + (i++) + " " + random.nextDouble());
		logger.warn("WARNING log message " + (i++) + " " + random.nextDouble());
		logger.error("ERROR log message " + (i++) + " " + random.nextDouble());
	}
	
}

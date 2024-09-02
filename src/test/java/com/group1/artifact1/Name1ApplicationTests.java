package com.group1.artifact1;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Name1ApplicationTests {
	public static Logger logger= (Logger) LoggerFactory.getLogger(Name1ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test cases executing");
        assertTrue(true);
	}

}

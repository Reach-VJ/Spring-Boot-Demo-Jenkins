package com.macys.SpringBootDemoJenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootDemoJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootDemoJenkinsApplicationTests.class);

	@Test
	 contextLoads() {
		logger.info("Test case executing.123");
		assertEquals(true,true);
	}

}

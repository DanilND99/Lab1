package mx.tec.lab;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstUnitTestApplicationTests {
	private static final Log LOG = LogFactory.getLog(FirstUnitTestApplicationTests.class);
	@BeforeAll
	public static void setup() {
		LOG.info("@BeforeAll executes before all tests methods in the class.");
	}
	@BeforeEach
	public void init() {
		LOG.info("@BeforeEach executes before each tests methods in the class.");
	}
	@Test
	public void simpleTest() {
		LOG.info("Simple Test.");
	}
	@Test
	public void otherSimpleTest() {
		LOG.info("Other Simple Test.");
	}
	@Test
	@Disabled
	public void notImplementedTest() {
		LOG.info("Not Implemented yet");
	}
	@AfterEach
	public void tearDown() {
		LOG.info("@AfterEach executes after each test method.");
	}
	@AfterAll
	public static void done() {
		LOG.info("@AfterAll executes after all test methods.");
	}
}

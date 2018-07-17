package com.cg.demo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RabbitMqConsumerApplicationTest</code> contains tests for the class <code>{@link RabbitMqConsumerApplication}</code>.
 *
 * @generatedBy CodePro at 7/11/18 2:26 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class RabbitMqConsumerApplicationTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/11/18 2:26 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		RabbitMqConsumerApplication.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodError: org.springframework.boot.builder.SpringApplicationBuilder.<init>([Ljava/lang/Class;)V
		//       at org.springframework.cloud.bootstrap.BootstrapApplicationListener.bootstrapServiceContext(BootstrapApplicationListener.java:170)
		//       at org.springframework.cloud.bootstrap.BootstrapApplicationListener.onApplicationEvent(BootstrapApplicationListener.java:104)
		//       at org.springframework.cloud.bootstrap.BootstrapApplicationListener.onApplicationEvent(BootstrapApplicationListener.java:70)
		//       at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:167)
		//       at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:139)
		//       at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:122)
		//       at org.springframework.boot.context.event.EventPublishingRunListener.environmentPrepared(EventPublishingRunListener.java:73)
		//       at org.springframework.boot.SpringApplicationRunListeners.environmentPrepared(SpringApplicationRunListeners.java:54)
		//       at org.springframework.boot.SpringApplication.prepareEnvironment(SpringApplication.java:336)
		//       at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
		//       at org.springframework.boot.SpringApplication.run(SpringApplication.java:1162)
		//       at org.springframework.boot.SpringApplication.run(SpringApplication.java:1151)
		//       at com.cg.demo.RabbitMqConsumerApplication.main(RabbitMqConsumerApplication.java:10)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/11/18 2:26 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/11/18 2:26 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/11/18 2:26 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitMqConsumerApplicationTest.class);
	}
}
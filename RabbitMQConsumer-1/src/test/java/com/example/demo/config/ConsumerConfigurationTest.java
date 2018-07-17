package com.example.demo.config;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.MessageConverter;

/**
 * The class <code>ConsumerConfigurationTest</code> contains tests for the class <code>{@link ConsumerConfiguration}</code>.
 *
 * @generatedBy CodePro at 7/10/18 8:31 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class ConsumerConfigurationTest {
	/**
	 * Run the Binding binding(Queue,DirectExchange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testBinding_1()
		throws Exception {
		ConsumerConfiguration fixture = new ConsumerConfiguration();
		fixture.exchange = "";
		fixture.queueName = "";
		Queue queue = new Queue("");
		DirectExchange exchange = new DirectExchange("");

		Binding result = fixture.binding(queue, exchange);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Binding [destination=, exchange=, routingKey=null]", result.toString());
		assertEquals("", result.getDestination());
		assertEquals(null, result.getRoutingKey());
		assertEquals("", result.getExchange());
		assertEquals(true, result.isDestinationQueue());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the DirectExchange exchange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testExchange_1()
		throws Exception {
		ConsumerConfiguration fixture = new ConsumerConfiguration();
		fixture.exchange = "";
		fixture.queueName = "";

		DirectExchange result = fixture.exchange();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direct", result.getType());
		assertEquals("Exchange [name=, type=direct, durable=true, autoDelete=false, internal=false, arguments={}]", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isInternal());
		assertEquals(true, result.isDurable());
		assertEquals(false, result.isAutoDelete());
		assertEquals(false, result.isDelayed());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the MessageConverter jsonMessageConverter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testJsonMessageConverter_1()
		throws Exception {
		ConsumerConfiguration fixture = new ConsumerConfiguration();
		fixture.exchange = "";
		fixture.queueName = "";

		MessageConverter result = fixture.jsonMessageConverter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Queue queue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testQueue_1()
		throws Exception {
		ConsumerConfiguration fixture = new ConsumerConfiguration();
		fixture.exchange = "";
		fixture.queueName = "";

		Queue result = fixture.queue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Queue [name=, durable=false, autoDelete=false, exclusive=false, arguments=null]", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isExclusive());
		assertEquals(null, result.getArguments());
		assertEquals(false, result.isDurable());
		assertEquals(false, result.isAutoDelete());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
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
	 * @generatedBy CodePro at 7/10/18 8:31 PM
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
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConsumerConfigurationTest.class);
	}
}
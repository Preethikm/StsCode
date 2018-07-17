package com.example.demo.service;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.example.demo.model.Employee;

/**
 * The class <code>ConsumerServiceTest</code> contains tests for the class <code>{@link ConsumerService}</code>.
 *
 * @generatedBy CodePro at 7/10/18 8:37 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class ConsumerServiceTest {
	/**
	 * Run the void read(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:37 PM
	 */
	@InjectMocks
	ConsumerService fixture;
	
	@Test
	public void testRead_1()
		throws Exception {
		Employee consumerModel = new Employee();
		consumerModel.setEmpId("");

		fixture.read(consumerModel);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 8:37 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 8:37 PM
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
	 * @generatedBy CodePro at 7/10/18 8:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConsumerServiceTest.class);
	}
}
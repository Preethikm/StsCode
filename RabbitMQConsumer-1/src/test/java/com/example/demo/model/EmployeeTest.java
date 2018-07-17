package com.example.demo.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EmployeeTest</code> contains tests for the class <code>{@link Employee}</code>.
 *
 * @generatedBy CodePro at 7/10/18 8:31 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class EmployeeTest {
	/**
	 * Run the String getEmpId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testGetEmpId_1()
		throws Exception {
		Employee fixture = new Employee();
		fixture.setEmpName("");
		fixture.setEmpId("");

		String result = fixture.getEmpId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getEmpName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testGetEmpName_1()
		throws Exception {
		Employee fixture = new Employee();
		fixture.setEmpName("");
		fixture.setEmpId("");

		String result = fixture.getEmpName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setEmpId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testSetEmpId_1()
		throws Exception {
		Employee fixture = new Employee();
		fixture.setEmpName("");
		fixture.setEmpId("");
		String empId = "";

		fixture.setEmpId(empId);

		// add additional test code here
	}

	/**
	 * Run the void setEmpName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 8:31 PM
	 */
	@Test
	public void testSetEmpName_1()
		throws Exception {
		Employee fixture = new Employee();
		fixture.setEmpName("");
		fixture.setEmpId("");
		String empName = "";

		fixture.setEmpName(empName);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(EmployeeTest.class);
	}
}
package aboudou.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import aboudou.spring.aop.Car;

public class CarTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDrive() {
		Car car = new Car();
		assertEquals("Car", car.toString());
	}

	@Test
	@Ignore
	public void testStop() {
		fail("Not yet implemented");
	}

}

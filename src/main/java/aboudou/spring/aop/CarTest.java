package aboudou.spring.aop;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void testDrive() {
		
	}

	@Test(expected=ArithmeticException.class)
	public void testStop() {
		Car car  = new Car();
		car.stop();
	}

}

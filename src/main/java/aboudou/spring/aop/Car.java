package aboudou.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

	final static Logger logger = LoggerFactory.getLogger(Car.class);
	

	public void drive() {
		logger.info("I am driving a car");
	}

	public int drive(int speed) {

		logger.info("I am driving a car with the speed of  " + speed);
		return speed;
	}

	/**
	 * @param shutOutWindow
	 * @return
	 */
	public String drive(String shutOutWindow) {
		logger.info("The car is driving and shut out window  " + shutOutWindow);
		return shutOutWindow;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car";
	}

	/**
	 * 
	 */
	public void drift() {
		logger.info("Car , we're about to drift !");
	}

	/**
	 * @return
	 */
	public String stop() {
		logger.info("Red light, time to stop!");

		return "Red light, time to stop!";
	}
	
	
}

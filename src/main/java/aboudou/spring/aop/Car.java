package aboudou.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

	final static Logger logger = LoggerFactory.getLogger(Car.class);
	
	public void drive() {
		//Meeting tracing concerns
		//logger.info("Car is driving ");
		
		//actual business logic for driving
		logger.info("Accelerating and moving ");
	}
	
	public void stop() {
		
		logger.info("Braking  to a stop");
	}
}

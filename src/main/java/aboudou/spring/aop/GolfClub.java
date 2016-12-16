package aboudou.spring.aop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GolfClub {

	static final  Logger logger = LoggerFactory.getLogger(GolfClub.class);
	
	public void swing() {
		logger.info("GolfClub is swin !! ");
	}
	
	public void drive() {
		logger.info("GolfClub is driving !! ");
	}
}

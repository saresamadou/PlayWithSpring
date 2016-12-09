package aboudou.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

	final static Logger logger = LoggerFactory.getLogger(Log.class);
	
	public void vehiculeAboutToMove() {
		logger.info("Adding to log Car is driving ");
	}
}

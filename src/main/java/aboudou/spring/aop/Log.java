package aboudou.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {

	final static Logger logger = LoggerFactory.getLogger(Log.class);

	@Before("matchASpecificBean()")
	public void vehiculeAboutToMove(JoinPoint jp) {
		logger.info("--------------------------------");
		logger.info("Saving to log (form aspect )!!! ");
		logger.info("Current joint point  " + jp.getStaticPart());

	}

	/*
	 * @AfterReturning(pointcut="execution(void aboudou.spring.aop.Car.*(..))")
	 * public void vehiculeAfterReturning(JoinPoint jp) {
	 * logger.info("Leaving the method " + jp.getStaticPart()); }
	 */

	@Pointcut("execution(void aboudou.spring.aop.Car.dr*(..))")
	public void anyMethodExecutionInCarThatStartWith_dr() {
	}

	@Pointcut("execution(String *(..))")
	public void anyMethodExecutionThatReturnAsString() {
	}

	@Pointcut("execution(int aboudou.spring.aop.Car.drive(..))")
	public void methodWhichReturnsOnlyVoid() {
	}

	@Pointcut("execution(* aboudou.spring.aop.Car.drive(String))")
	public void methodWithStringParameters() {
	}

	@Pointcut("execution(* *(..))")
	public void allMethod() {
	}

	@Pointcut("args(*)")
	public void matchArgsDesignator() {
	}

	@Pointcut("args(*)")
	public void matchArgsDesignatorToGetParams() {
	}

	@Pointcut("bean(*)")
	public void matchASpecificBean() {
	}
}

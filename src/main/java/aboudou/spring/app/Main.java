package aboudou.spring.app;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import aboudou.spring.aop.Car;
import aboudou.spring.aop.GolfClub;
import aboudou.spring.app.enums.Color;
import aboudou.spring.config.AppConfig;
import aboudou.spring.test.TestJunit1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author absare
 *
 */
public class Main {

	/**
	 * @param args arguments of the main entry point function
	 */
	public static void main(String[] args) {
		
		 final  Logger logging = LoggerFactory.getLogger(Main.class);
		
		//Get instance of xml application context
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		
		//Get an instance of java based configuration file
		//ApplicationContext javaBasedContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get bean from the context
		/*Fruit fruit = context.getBean("fruit", Fruit.class);
		Vegetable vegtable = context.getBean("vegetable", Vegetable.class);
		Fruit fruitwithName = context.getBean("fruitwithName", Fruit.class);
		Vegetable vegtablewithName = context.getBean("vegetablewithName", Vegetable.class);
		Fruit fruitWithListAndMap = (Fruit)context.getBean("fruitWithListAndMap");
		Vegetable vegUsingPNameSpace = context.getBean("vegUsingPNameSpace", Vegetable.class);
		Meal meal =(Meal)context.getBean("mealUsingConstructorInj");
		Fruit fruit = context.getBean("externalFruit", Fruit.class);
		Meal mealWithInnerBean = (Meal)context.getBean("mealOutBean");
		 
		
		//Play with the bean
		System.out.println(fruit.talkAboutYourself());
		System.out.println(vegtable.talkAboutYourself());
		System.out.println(fruitwithName.talkAboutYourself());
		System.out.println(vegtablewithName.talkAboutYourself());
		System.out.println(fruitWithListAndMap.talkAboutYourself());
		System.out.println(vegUsingPNameSpace.talkAboutYourself());
		System.out.println(meal.whatsInThisMeal());
		System.out.println(meal.whatsInThisMeal());
		System.out.println(mealWithInnerBean.whatsInThisMeal());
		 myCar.drive(112);
		
		Car myCar = context.getBean("car", Car.class);
		GolfClub gc = context.getBean("GolfClub", GolfClub.class);
		 
		 myCar.drive();
		 myCar.drive("heloo woooorld");
		 myCar.drive(112, 120);
		 myCar.drift();
		 myCar.stop();
		 
		 gc.drive();
		 gc.swing();*/
		 
	/*	Result result = JUnitCore.runClasses(TestJunit1.class);
		
		 for(Failure failure : result.getFailures()) {
			logging.info(failure.toString());
		 }
		 
		 logging.info("Test successfulnes " + result.wasSuccessful());*/
		 
		
		Meal myAnnotatedSpringMeal = context.getBean("mealByAnnotation", Meal.class);
		System.out.println(myAnnotatedSpringMeal.whatsInThisMeal());
		//Close the instance of application context
		((FileSystemXmlApplicationContext) context).close();
		
		//Close the java based application context
		//((AnnotationConfigApplicationContext)javaBasedContext).close();
		
		
		//Test the enum class
		
	}
}

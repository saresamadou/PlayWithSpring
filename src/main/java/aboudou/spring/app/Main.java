package aboudou.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//Get instance of application context
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		
		//Get bean from the context
		/*Fruit fruit = context.getBean("fruit", Fruit.class);
		Vegetable vegtable = context.getBean("vegetable", Vegetable.class);
		Fruit fruitwithName = context.getBean("fruitwithName", Fruit.class);
		Vegetable vegtablewithName = context.getBean("vegetablewithName", Vegetable.class);
		Fruit fruitWithListAndMap = (Fruit)context.getBean("fruitWithListAndMap");
		Vegetable vegUsingPNameSpace = context.getBean("vegUsingPNameSpace", Vegetable.class);
		
		//Play with the bean
		System.out.println(fruit.talkAboutYourself());
		System.out.println(vegtable.talkAboutYourself());
		System.out.println(fruitwithName.talkAboutYourself());
		System.out.println(vegtablewithName.talkAboutYourself());
		System.out.println(fruitWithListAndMap.talkAboutYourself());
		System.out.println(vegUsingPNameSpace.talkAboutYourself());*/
		
		Meal meal =(Meal)context.getBean("meal");
		System.out.println(meal.whatsInThisMeal());
		
		//Close the instance of application context
		((FileSystemXmlApplicationContext) context).close();
		
	}
}

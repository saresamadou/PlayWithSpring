package aboudou.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		
		Fruit fruit = context.getBean("fruit", Fruit.class);
		Vegetable vegtable = context.getBean("vegetable", Vegetable.class);
		Fruit fruitwithName = context.getBean("fruitwithName", Fruit.class);
		Vegetable vegtablewithName = context.getBean("vegetablewithName", Vegetable.class);
		Fruit fruitWithListAndMap = (Fruit)context.getBean("fruitWithListAndMap");
		
		System.out.println(fruit.talkAboutYourself());
		System.out.println(vegtable.talkAboutYourself());
		System.out.println(fruitwithName.talkAboutYourself());
		System.out.println(vegtablewithName.talkAboutYourself());
		System.out.println(fruitWithListAndMap.talkAboutYourself());
		
		((FileSystemXmlApplicationContext) context).close();
		
	}
}

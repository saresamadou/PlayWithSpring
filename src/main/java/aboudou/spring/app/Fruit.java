package aboudou.spring.app;

import java.util.List;
import java.util.Map;


public class Fruit {

	//Class variables
	
	private String myName;
	
	private List<String> fruitNameList;

	private Map<String, String> fruitNameMap;
	
	//Default no args constructor
	public Fruit() {

	}

	//Constuctor with args
	public Fruit(String myName) {
		super();
		this.myName = myName;
	}

	//Getters and setters
	
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	
	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	//ToString Method
	@Override
	public String toString() {
		return "Fruit [myName=" + myName + "]";
	}

	//Method that Fruit used to talk about himself
	public String talkAboutYourself() {
		String speech = "Hi I am a fruit";
		if (this.myName != null && this.myName != "") {
			speech += " and my name is " + this.myName;
		}

 		return speech;
	}

}

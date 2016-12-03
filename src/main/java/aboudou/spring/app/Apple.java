package aboudou.spring.app;

public class Apple extends Fruit {

	private String name;
	private String descrption = "not set";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	@Override
	public String talkAboutYourself() {
		StringBuilder speech = new StringBuilder();
		speech.append("Hi I am a fruit and my name is ");
		speech.append(this.name);
		speech.append(" and here is my description : ");
		speech.append(this.descrption);
		return speech.toString();
	}

}

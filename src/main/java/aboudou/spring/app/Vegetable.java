package aboudou.spring.app;

public class Vegetable {

	private String myName;

	public Vegetable(String myName) {
		super();
		this.myName = myName;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Vegetable() {

	}

	public String talkAboutYourself() {
		String speech = "Hi I am a vegetable";
		
		//Give the name only if the name is set
		if (this.myName != null && this.myName != "") {
			speech += " and my name is " + this.myName;
		}
		
		return speech;
	}

}

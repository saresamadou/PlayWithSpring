package aboudou.spring.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Meal {

	@Autowired
	private Fruit fruit;
	@Autowired
	private Meat meat;
	@Autowired
	private Dairy dairy;
	@Autowired
	private Grain grain;
	@Autowired
	private Vegetable vegetable;

	//Default no args
	public Meal() {

	}

	//Full meal constructor
	public Meal(Fruit fruit, Meat meat, Dairy dairy, Grain grain, Vegetable vegetable) {
		super();
		this.fruit = fruit;
		this.meat = meat;
		this.dairy = dairy;
		this.grain = grain;
		this.vegetable = vegetable;
	}

	//Getters and setters
	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public Grain getGrain() {
		return grain;
	}

	public void setGrain(Grain grain) {
		this.grain = grain;
	}

	public Vegetable getVegetable() {
		return vegetable;
	}

	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}

	/**
	 * Function which talk about what is inside a meal
	 * @return answer
	 */
	public String whatsInThisMeal() {

		String answer = "This meal contains :";

		if (this.dairy != null)
			answer += " some dairy: " + this.dairy.talkAboutYourself() + "\n";
		if (this.fruit != null)
			answer += " some fruit: " + this.fruit.talkAboutYourself() + " \n";
		if (this.meat != null)
			answer += " some meat: " + this.meat.talkAboutYourself() + " \n";
		if (this.grain != null)
			answer += " some grain: " + this.grain.talkAboutYourself() + " \n";
		if (this.vegetable != null)
			answer += " some vegetable: " + this.vegetable.talkAboutYourself();

		return answer;
	}
}

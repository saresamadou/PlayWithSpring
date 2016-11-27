package aboudou.spring.app;

public class Meal {

	private Fruit fruit;
	private Meat meat;
	private Dairy dairy;
	private Grain grain;
	private Vegetable vegetable;

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

	public String whatsInThisMeal() {
		
		String answer="This meal contains :";
		
		if(this.dairy!=null) answer+=" some dairy: ";
		if(this.fruit!=null) answer+=" some fruit: ";
		if(this.meat!=null) answer+=" some meat: ";
		if(this.grain!=null) answer+=" some grain: ";
		if(this.vegetable!=null) answer+=" some vegetable: ";
		
		return answer;
	}
}

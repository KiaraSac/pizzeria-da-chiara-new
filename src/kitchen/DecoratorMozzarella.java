package kitchen;

import factory.PizzaBaseFactory;

public class DecoratorMozzarella extends PizzaDecorator {

	private double additionalPrice = 0.5;
	
	public DecoratorMozzarella(Pizza p) {
		super(p);
	}

	@Override
	public String getDescription() {
		return super.getDescription()+", Mozzarella";
	}

	@Override
	public double getPrice() {
		return super.getPrice()+additionalPrice;
	}
	
	
	

}

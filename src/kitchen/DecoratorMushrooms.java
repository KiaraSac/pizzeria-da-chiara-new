package kitchen;

public class DecoratorMushrooms extends PizzaDecorator {
	private double additionalPrice = 2;

	public DecoratorMushrooms(Pizza p) {
		super(p);
	}

	@Override
	public String getDescription() {
		return super.getDescription()+", Mushrooms";
	}

	@Override
	public double getPrice() {
		return super.getPrice()+additionalPrice;
	}

}

package kitchen;

public class DecoratorTomato extends PizzaDecorator {

	private double additionalPrice = 1.5;

	public DecoratorTomato(Pizza p) {
		super(p);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Tomato Souce";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + additionalPrice;
	}

}

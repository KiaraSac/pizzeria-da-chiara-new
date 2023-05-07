package observer;

import kitchen.Pizza;

public class ObserverEarnings implements ObserverPizzeria {

	private double earnings = 0;

	public double getEarnings() {
		return earnings;
	}

	@Override
	public void update(Pizza pizza) {
		this.earnings+=pizza.getPrice();
	}
	
	


}

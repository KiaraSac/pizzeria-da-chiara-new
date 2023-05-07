package observer;

import java.util.HashMap;
import java.util.Map;

import factory.PizzaBaseFactory;
import factory.PizzaFactory;
import kitchen.Pizza;

public class ObserverEarnings implements ObserverPizzeria {

	private static double earnings = 0;

	static double getEarnings() {
		return earnings;
	}

	@Override
	public void update(Pizza pizza) {
		ObserverEarnings.earnings+=pizza.getPrice();
	}
	
	


}

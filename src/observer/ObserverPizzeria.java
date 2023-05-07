package observer;

import factory.PizzaBaseFactory;
import kitchen.Pizza;

public interface ObserverPizzeria {
	public void update(Pizza pizza);
}

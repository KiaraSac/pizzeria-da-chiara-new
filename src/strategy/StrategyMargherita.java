package strategy;

import kitchen.DecoratorMozzarella;
import kitchen.DecoratorTomato;
import kitchen.Pizza;

public class StrategyMargherita implements StrategyRecipe {

	@Override
	public Pizza create(Pizza pizza) {
		return new DecoratorMozzarella(new DecoratorTomato(pizza));
	}

}

package strategy;

import kitchen.DecoratorMozzarella;
import kitchen.DecoratorMushrooms;
import kitchen.DecoratorTomato;
import kitchen.Pizza;

public class StrategyMushrooms implements StrategyRecipe {

	@Override
	public Pizza create(Pizza pizza) {
		return new DecoratorMushrooms(new DecoratorMozzarella(new DecoratorTomato(pizza)));
	}

}

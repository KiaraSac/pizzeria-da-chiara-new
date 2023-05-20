package factory;

import kitchen.*;
import strategy.StrategyRecipe;

public class PizzaBaseGlutenFreeFactory extends PizzaFactory {

	PizzaBaseGlutenFreeFactory(StrategyRecipe strategyRecipe) {
		super(strategyRecipe);
	}

	PizzaBaseGlutenFreeFactory() {
		super();
	}

	@Override
	public Pizza create() {
		Pizza pizza = new PizzaBaseGlutenFree();
		if (super.getStrategyRecipe() != null)
			pizza = super.getStrategyRecipe().create(pizza);
		return pizza;
	}

}

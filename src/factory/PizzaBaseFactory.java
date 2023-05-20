package factory;

import kitchen.Pizza;
import kitchen.PizzaBase;
import strategy.StrategyRecipe;

public class PizzaBaseFactory extends PizzaFactory {

	public PizzaBaseFactory(StrategyRecipe strategyRecipe) {
		super(strategyRecipe);
	}

	public PizzaBaseFactory() {
		super();
	}

	@Override
	public Pizza create() {
		Pizza pizza = new PizzaBase();
		if (super.getStrategyRecipe() != null)
			pizza = super.getStrategyRecipe().create(pizza);
		return pizza;
	}

}

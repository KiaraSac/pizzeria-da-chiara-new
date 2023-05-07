package factory;

import kitchen.Pizza;
import kitchen.PizzaBase;
import strategy.StrategyRecipe;

public class PizzaBaseFactory extends PizzaFactory {

	PizzaBaseFactory(StrategyRecipe strategyRecipe) {
		super(strategyRecipe);
	}
	
	public PizzaBaseFactory() {
		super();
	}

	@Override
	public Pizza create() {
		Pizza pizza = new PizzaBase();
		if (strategyRecipe != null)
			pizza= strategyRecipe.create(pizza);
		notifyObservers(pizza);	
		return pizza;
	}

}

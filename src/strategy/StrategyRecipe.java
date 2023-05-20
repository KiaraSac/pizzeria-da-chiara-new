package strategy;

import kitchen.Pizza;

public interface StrategyRecipe {

	public Pizza create(Pizza pizza);
}

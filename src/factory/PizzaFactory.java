package factory;

import kitchen.Pizza;
import strategy.StrategyRecipe;

public abstract class PizzaFactory {

	private StrategyRecipe strategyRecipe;

	PizzaFactory(StrategyRecipe strategyRecipe) {
		this.strategyRecipe = strategyRecipe;
	}

	public PizzaFactory() {
	}

	protected StrategyRecipe getStrategyRecipe() {
		return strategyRecipe;
	}

	public abstract Pizza create();

}

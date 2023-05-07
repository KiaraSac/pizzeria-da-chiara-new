package factory;
import java.util.ArrayList;
import java.util.List;

import kitchen.Pizza;
import observer.ObserverPizzeria;
import strategy.StrategyRecipe;

public abstract class PizzaFactory {
	
	List<ObserverPizzeria> observers; 
	protected StrategyRecipe strategyRecipe;
	
	PizzaFactory(StrategyRecipe strategyRecipe) {
		this.observers = new ArrayList<>();
		this.strategyRecipe = strategyRecipe;
	}

	public PizzaFactory() {
		this.observers = new ArrayList<>();
	}
	
	public void notifyObservers(Pizza pizza) {
		observers.forEach(o->o.update(pizza));
	}
	
	public void addObserver(ObserverPizzeria o) {
		observers.add(o);
	}
	
	public void removeObserver(ObserverPizzeria o) {
		observers.remove(o);
	}
	
	public abstract Pizza create();
	
}

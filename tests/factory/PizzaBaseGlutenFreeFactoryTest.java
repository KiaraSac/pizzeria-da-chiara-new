package factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import kitchen.Pizza;
import kitchen.PizzaBaseGlutenFree;
import kitchen.PizzaDecorator;
import strategy.StrategyMargherita;
import strategy.StrategyMushrooms;

public class PizzaBaseGlutenFreeFactoryTest {

	@Test
	public void testCreate() {
		PizzaBaseGlutenFreeFactory f = new PizzaBaseGlutenFreeFactory();
		assertThat(f.create()).isExactlyInstanceOf(new PizzaBaseGlutenFree().getClass());
	}
	
	@Test
	public void testCreateWithStrategyMargherita() {
		PizzaFactory f = new PizzaBaseGlutenFreeFactory(new StrategyMargherita());
		Pizza m = f.create();
		assertThat(m).isInstanceOf(PizzaDecorator.class);
		assertThat(m.getDescription()).isEqualTo("Base Pizza Gluten Free, Tomato Souce, Mozzarella");
	}
	
	@Test
	public void testCreateWithStrategyMushrooms() {
		PizzaFactory f = new PizzaBaseGlutenFreeFactory(new StrategyMushrooms());
		Pizza m = f.create();
		assertThat(m).isInstanceOf(PizzaDecorator.class);
		assertThat(m.getDescription()).isEqualTo("Base Pizza Gluten Free, Tomato Souce, Mozzarella, Mushrooms");
	}
	
}

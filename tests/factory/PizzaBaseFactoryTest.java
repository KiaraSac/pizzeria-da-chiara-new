package factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import kitchen.Pizza;
import kitchen.PizzaBase;
import kitchen.PizzaDecorator;
import strategy.StrategyMargherita;
import strategy.StrategyMushrooms;


public class PizzaBaseFactoryTest {

	@Test
	public void testCreate() {
		PizzaBaseFactory f = new PizzaBaseFactory();
		assertThat(f.create()).isExactlyInstanceOf(PizzaBase.class);
	}
	
	@Test
	public void testCreateWithStrategyMargherita() {
		PizzaBaseFactory f = new PizzaBaseFactory(new StrategyMargherita());
		Pizza m = f.create();
		assertThat(m).isInstanceOf(PizzaDecorator.class);
		assertThat(m.getDescription()).isEqualTo("Base Pizza, Tomato Souce, Mozzarella");
	}
	
	@Test
	public void testCreateWithStrategyMushrooms() {
		PizzaBaseFactory f = new PizzaBaseFactory(new StrategyMushrooms());
		Pizza m = f.create();
		assertThat(m).isInstanceOf(PizzaDecorator.class);
		assertThat(m.getDescription()).isEqualTo("Base Pizza, Tomato Souce, Mozzarella, Mushrooms");
	}

}

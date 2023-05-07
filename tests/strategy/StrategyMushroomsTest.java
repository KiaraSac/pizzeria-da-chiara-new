package strategy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import kitchen.PizzaBase;

public class StrategyMushroomsTest {

	@Test
	public void testCreate() {
		assertThat(new StrategyMushrooms().create(new PizzaBase()).getDescription())
			.isEqualTo("Base Pizza, Tomato Souce, Mozzarella, Mushrooms");
	}

}

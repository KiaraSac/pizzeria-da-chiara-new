package kitchen;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DecoratorMushroomsTest {

	@Test
	public void testGetDescription() {
		Pizza p = new DecoratorMushrooms(new PizzaBase());
		assertThat(p.getDescription()).isEqualTo("Base Pizza, Mushrooms");
	}
	
	@Test
	public void testGetPrice() {
		Pizza p = new DecoratorMushrooms(new PizzaBase());
		assertThat(p.getPrice()).isEqualTo(6.5);
	}

}

package kitchen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTomatoTest {

	@Test
	public void testGetDescription() {
		Pizza p = new DecoratorTomato(new PizzaBase());
		assertThat(p.getDescription()).isEqualTo("Base Pizza, Tomato Souce");
	}
	
	@Test
	public void testGetPrice() {
		Pizza p = new DecoratorTomato(new PizzaBase());
		assertThat(p.getPrice()).isEqualTo(6);
	}
}

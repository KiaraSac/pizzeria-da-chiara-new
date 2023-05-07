package kitchen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorMozzarellaTest {

	@Test
	public void testGetDescription() {
		Pizza p = new DecoratorMozzarella(new PizzaBase());
		assertThat(p.getDescription()).isEqualTo("Base Pizza, Mozzarella");
	}
	
	@Test
	public void testGetPrice() {
		Pizza p = new DecoratorMozzarella(new PizzaBase());
		assertThat(p.getPrice()).isEqualTo(5);
	}

}

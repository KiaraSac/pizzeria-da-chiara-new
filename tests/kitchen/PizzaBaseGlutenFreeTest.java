package kitchen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaBaseGlutenFreeTest {

	@Test
	public void testGetDescription() {
		Pizza p = new PizzaBaseGlutenFree();
		assertThat(p.getDescription()).isEqualTo("Base Pizza Gluten Free");
	}
	
	@Test
	public void testGetPrice() {
		Pizza p = new PizzaBaseGlutenFree();
		assertThat(p.getPrice()).isEqualTo(4.5);
	}

}

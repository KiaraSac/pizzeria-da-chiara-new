package kitchen;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PizzaBaseTest {

	@Test
	public void testGetDescription() {
		Pizza p = new PizzaBase();
		assertThat(p.getDescription()).isEqualTo("Base Pizza");
	}
	
	@Test
	public void testGetPrice() {
		Pizza p = new PizzaBase();
		assertThat(p.getPrice()).isEqualTo(4.5);
	}
	

}

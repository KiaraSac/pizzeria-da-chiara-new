package observer;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import kitchen.PizzaBase;
import kitchen.PizzaBaseGlutenFree;

public class ObserverEarningsTest {
	

	@Test
	public void testUpdate() {
		ObserverEarnings e = new ObserverEarnings();
		e.update(new PizzaBase());
		e.update(new PizzaBaseGlutenFree());
		assertThat(ObserverEarnings.getEarnings()).isEqualTo(9);
	}

}

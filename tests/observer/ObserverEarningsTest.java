package observer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

import kitchen.PizzaBase;
import kitchen.PizzaBaseGlutenFree;

public class ObserverEarningsTest {
	

	@Test
	public void testUpdate() {
		ObserverEarnings e = new ObserverEarnings();
		double previous=e.getEarnings();
		e.update(Arrays.asList(new PizzaBase(),new PizzaBaseGlutenFree()));
		//e.update(new PizzaBaseGlutenFree());
		assertThat(e.getEarnings()).isEqualTo(previous+9);
		e.update(Arrays.asList(new PizzaBase()));
		assertThat(e.getEarnings()).isEqualTo(previous+ 13.5);
	}

}

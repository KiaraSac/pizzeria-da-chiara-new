package observer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

import kitchen.PizzaBase;

public class ObserverOrderTest {

	@Test
	public void testUpdate() {
		ObserverOrder observer = new ObserverOrder();
		
		observer.update(Arrays.asList(new PizzaBase(),new PizzaBase()));
		assertThat(observer.getTotal()).isEqualTo(9);
		
	}

}

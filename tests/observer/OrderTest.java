package observer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

import kitchen.PizzaBase;
import kitchen.PizzaBaseGlutenFree;

public class OrderTest {

	@Test
	public void testBuildOrder() {
		Order o=new Order.OrderBuilder()
				.withItem(new PizzaBase())
				.withItem(new PizzaBaseGlutenFree())
				.withAddress("Viale Morgagni,65")
				.withPaymentMethod("credit card")
				.withObserver(new ObserverEarnings()).buildOrder();
		
		assertThat(o.getItems()).hasSize(2);
		assertThat(o.getAddress()).isEqualTo("Viale Morgagni,65" );
		assertThat(o.getPaymentMethod()).isEqualTo("credit card");
		assertThat(o.getObservers()).hasSize(1);
	}

	@Test
	public void testAddItem() {
		Order o=new Order.OrderBuilder()
				.withItem(new PizzaBase())
				.withItem(new PizzaBaseGlutenFree()).buildOrder();
		
		assertThat(o.getItems()).hasSize(2);
		
		o.addItem(new PizzaBase());
		
		assertThat(o.getItems()).hasSize(3);

	}
	
	@Test
	public void testRemoveObserver() {
		Order o = new Order.OrderBuilder().buildOrder();
		ObserverPizzeria notToRemove= new ObserverEarnings();
		ObserverPizzeria toRemove= new ObserverOrder();
		
		o.getObservers().addAll(Arrays.asList(toRemove,notToRemove));
		o.removeObserver(toRemove);
		
		assertThat(o.getObservers()).contains(notToRemove);
		assertThat(o.getObservers()).hasSize(1);
	}
	
	@Test
	public void testNotifyObserverEarnings() {
		ObserverEarnings earnings= new ObserverEarnings();
		double previous=earnings.getEarnings();

		Order o = new Order.OrderBuilder().buildOrder();
		o.getObservers().addAll(Arrays.asList(earnings));
		o.notifyObservers(Arrays.asList(new PizzaBase()));
		
		assertThat(earnings.getEarnings()).isEqualTo(previous+ 4.5);
		
		o.notifyObservers(Arrays.asList(new PizzaBase()));
		
		assertThat(earnings.getEarnings()).isEqualTo(previous+ 9);
	}
	
	@Test
	public void testNotifyObserverOrder() {
		ObserverOrder totalPrice= new ObserverOrder();

		Order o = new Order.OrderBuilder().buildOrder();
		o.getObservers().addAll(Arrays.asList(totalPrice));
		o.notifyObservers(Arrays.asList(new PizzaBase()));
		
		assertThat(totalPrice.getTotal()).isEqualTo(4.5);
		
		o.notifyObservers(Arrays.asList(new PizzaBase()));
		
		assertThat(totalPrice.getTotal()).isEqualTo(9);
	}
}

package factory;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

import observer.ObserverEarnings;
import observer.ObserverPizzeria;

public class PizzaFactoryTest {

	@Test
	public void testNotifyObservers() {
		PizzaBaseFactory publisher = new PizzaBaseFactory();
		ObserverEarnings observer = new ObserverEarnings();
		
		publisher.observers.add(observer);
		publisher.create();
		assertThat(observer.getEarnings()).isEqualTo(4.5);
		
	}
	
	@Test
	public void testAddObserver() {
		PizzaFactory f = new PizzaBaseFactory();
		ObserverPizzeria o = new ObserverEarnings();
		f.addObserver(o);
		assertThat(f.observers).contains(o);
		assertThat(f.observers).size().isEqualTo(1);
	}
	
	@Test
	public void testRemoveObserver() {
		PizzaFactory f = new PizzaBaseFactory();
		ObserverPizzeria toRemove = new ObserverEarnings();
		ObserverPizzeria notToRemove = new ObserverEarnings();
		
		f.observers.addAll(Arrays.asList(toRemove,notToRemove));
		
		f.removeObserver(toRemove);
		
		assertThat(f.observers).contains(notToRemove);
		assertThat(f.observers).size().isEqualTo(1);

	}

}

package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kitchen.Pizza;

public class Order {

	private List<Pizza> items = new ArrayList<>();
	private String address;
	private String paymentMethod;
	private List<ObserverPizzeria> observers = new ArrayList<>();

	private Order() {
	}

	public void addItem(Pizza p) {
		this.items.add(p);
		notifyObservers(Arrays.asList(p));
	}
	
	private void setItems(List<Pizza> items) {
		this.items = items;
		notifyObservers(this.items);
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	protected List<Pizza> getItems() {
		return items;
	}

	protected String getAddress() {
		return address;
	}

	protected String getPaymentMethod() {
		return paymentMethod;
	}
	
	List<ObserverPizzeria> getObservers() {
		return observers;
	}

	protected void notifyObservers(List<Pizza> items) {
		observers.forEach(o -> o.update(items));
	}

	private void addObserver(List<ObserverPizzeria> observers) {
		this.observers.addAll(observers);
	}

	public void removeObserver(ObserverPizzeria o) {
		observers.remove(o);
	}

	public static class OrderBuilder {
		private List<Pizza> items = new ArrayList<>();
		private List<ObserverPizzeria> observers = new ArrayList<>();
		private String address;
		private String paymentMethod;

		public OrderBuilder withItem(Pizza p) {
			this.items.add(p);
			return this;
		}

		public OrderBuilder withAddress(String a) {
			this.address = a;
			return this;
		}

		public OrderBuilder withPaymentMethod(String p) {
			this.paymentMethod = p;
			return this;
		}

		public OrderBuilder withObserver(ObserverPizzeria o) {
			this.observers.add(o);
			return this;
		}

		public Order buildOrder() {
			Order order = new Order();
			order.setAddress(address);
			order.addObserver(observers);
			order.setItems(items);
			order.setPaymentMethod(paymentMethod);

			return order;
		}
	}

}

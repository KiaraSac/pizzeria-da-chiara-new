package observer;

import java.util.List;
import kitchen.Pizza;

public class ObserverOrder implements ObserverPizzeria {

	private double total;

	@Override
	public void update(List<Pizza> items) {
		total += items.stream()
					.mapToDouble(p -> p.getPrice())
					.sum();
	}

	public double getTotal() {
		return total;
	}

}

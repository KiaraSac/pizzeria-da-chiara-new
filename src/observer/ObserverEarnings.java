package observer;

import java.util.List;
import kitchen.Pizza;

public class ObserverEarnings implements ObserverPizzeria {

	private static double earnings = 0;

	public double getEarnings() {
		return earnings;
	}

	@Override
	public void update(List<Pizza> list) {
		ObserverEarnings.earnings += list.stream()
										.mapToDouble(p -> p.getPrice())
										.sum();
	}

}

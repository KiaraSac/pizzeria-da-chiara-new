package kitchen;

import observer.ObserverEarnings;

public interface Pizza {
	
	public String getDescription();
	
	public default double getPrice() {
		return 4.5;
	}
}

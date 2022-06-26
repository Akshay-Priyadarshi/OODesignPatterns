package observer;

/**
 * OBSERVER PATTERN
 * The Observer Pattern defines a one-to-many dependency between objects so that when
 * one object changes state, all of its dependents are notified and updated automatically.
 * 
 * Making a change in the observable automatically passes the information onto
 * all of its dependents or observers and thus the need of polling data on change
 * vanishes.
 */
public class Main {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation,weatherStation.getTemperature());
		WindowDisplay windowDisplay = new WindowDisplay(weatherStation,weatherStation.getTemperature());
		
		weatherStation.add(phoneDisplay);
		weatherStation.add(windowDisplay);
		
		phoneDisplay.display();
		windowDisplay.display();
		
		weatherStation.setTemperature(26);
		
		weatherStation.setTemperature(24);
		
		weatherStation.setTemperature(18);
	}
}

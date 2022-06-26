package observer;

import java.util.ArrayList;

public class WeatherStation implements IObservable{

	private int temperature = 0;
	ArrayList<IObserver> observers; 
	
	public WeatherStation() {
		this.observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void add(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer: observers) {
			observer.update();
		}
	}
	
	public void setTemperature(int temp) {
		this.temperature = temp;
		this.notifyObservers();
	}
	
	public int getTemperature() {
		return this.temperature;
	}
}

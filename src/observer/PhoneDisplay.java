package observer;

public class PhoneDisplay implements IObserver, IDisplay{

	WeatherStation weatherStation;
	int temperature;
	
	public PhoneDisplay(WeatherStation weatherStation,int temp) {
		this.weatherStation = weatherStation;
		this.temperature = temp;
	}

	@Override
	public void update() {
		this.temperature = weatherStation.getTemperature();
		this.display();
	}
	
	@Override
	public void display() {
		System.out.println("Temperature: " + this.temperature);
	}

}

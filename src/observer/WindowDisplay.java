package observer;

public class WindowDisplay implements IObserver, IDisplay{
	
	int temperature;
	WeatherStation weatherStation;

	public WindowDisplay(WeatherStation weatherStation,int temp) {
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

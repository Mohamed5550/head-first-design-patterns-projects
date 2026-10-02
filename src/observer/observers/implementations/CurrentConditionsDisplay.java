package observer.observers.implementations;

import observer.contracts.DisplayElement;
import observer.dataObjects.WeatherDataObject;
import observer.observers.Observer;
import observer.subjects.implementations.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherDataObject weatherDataobject)
    {
        this.temperature = weatherDataobject.temperature;
        this.humidity = weatherDataobject.humidity;

        display();
    }

    public void display()
    {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}

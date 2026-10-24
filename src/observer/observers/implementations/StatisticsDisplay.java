package observer.observers.implementations;

import observer.contracts.DisplayElement;
import observer.records.WeatherRecord;
import observer.observers.Observer;
import observer.subjects.implementations.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherRecord weatherRecord) {
        tempSum += weatherRecord.temperature();
        numReadings++;

        if (weatherRecord.temperature() > maxTemp) {
            maxTemp = weatherRecord.temperature();
        }

        if (weatherRecord.temperature() < minTemp) {
            minTemp = weatherRecord.temperature();
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
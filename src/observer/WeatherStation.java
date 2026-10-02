package observer;

import observer.dataObjects.WeatherDataObject;
import observer.observers.implementations.CurrentConditionsDisplay;
import observer.observers.implementations.ForecastDisplay;
import observer.observers.implementations.HeatIndexDisplay;
import observer.observers.implementations.StatisticsDisplay;
import observer.subjects.implementations.WeatherData;

public class WeatherStation {
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        WeatherDataObject measurementsObject1 = new WeatherDataObject();
        measurementsObject1.temperature = 80;
        measurementsObject1.humidity = 65;
        measurementsObject1.pressure = 30.4f;

        weatherData.setMeasurements(measurementsObject1);
    }
}


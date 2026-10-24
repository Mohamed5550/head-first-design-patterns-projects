package observer;

import observer.records.WeatherRecord;
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

        WeatherRecord measurementsObject1 = new WeatherRecord(80, 65, 30.4f);

        weatherData.setMeasurements(measurementsObject1);
    }
}


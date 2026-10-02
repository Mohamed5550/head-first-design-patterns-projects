package observer.subjects.implementations;

import observer.dataObjects.WeatherDataObject;
import observer.observers.Observer;
import observer.subjects.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private WeatherDataObject weatherData;

    public WeatherData()
    {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers()
    {
        for(Observer observer: observers) {
            observer.update(weatherData);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(WeatherDataObject data)
    {
        this.weatherData = data;

        this.measurementsChanged();
    }
}

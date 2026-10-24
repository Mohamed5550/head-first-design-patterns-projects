package observer.observers;

import observer.records.WeatherRecord;

public interface Observer {
    public void update(WeatherRecord weatherDataobject);
}

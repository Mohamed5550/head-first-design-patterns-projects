package observer.observers;

import observer.dataObjects.WeatherDataObject;

public interface Observer {
    public void update(WeatherDataObject weatherDataobject);
}

package observer;

public interface WeatherObservable {
    boolean registerWeatherObserver(Observer observer);

    boolean deregisterWeatherObserver(Observer observer);

    void notifyWeatherChanges();
}

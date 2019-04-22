package observer;

public class Main {
    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherStation();
        Display consoleDisplay = new ConsoleDisplay();
        Observer observer = new WeatherObserver(consoleDisplay);
        weatherObservable.registerWeatherObserver(observer);
        ((WeatherStation) weatherObservable).setWeatherInfo(22,33);
    }
}

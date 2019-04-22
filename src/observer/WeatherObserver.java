package observer;

public class WeatherObserver implements Observer,Display{
    private final Display display;

    public WeatherObserver(Display display) {
        this.display = display;

    }

    public void update(double temperature,double humidity){
        System.out.println("Weather info updates");
        display(temperature,humidity);
    }

    @Override
    public void display(double humidity, double temperature) {
        display.display(humidity,temperature);
    }
}

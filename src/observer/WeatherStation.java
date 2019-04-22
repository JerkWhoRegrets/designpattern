package observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements WeatherObservable{
    private double temperature;
    private double humidity;

    private List<Observer> observers;

    public WeatherStation(){
        observers = new LinkedList<>();
    }

    public boolean registerWeatherObserver(Observer observer){
        return this.observers.add(observer);
    }

    public boolean deregisterWeatherObserver(Observer observer){
        if(!this.observers.isEmpty()){
            return this.observers.remove(observer);
        }
        return false;
    }

    public void notifyWeatherChanges(){
        for(Observer observer : observers){
            observer.update(this.temperature,this.humidity);
        }
    }

    public void setWeatherInfo(double humidity,double temperature){
        this.humidity = humidity;
        this.temperature = temperature;
        notifyWeatherChanges();
    }

}

package observer;

public class ConsoleDisplay implements Display {
    @Override
    public void display(double humidity, double temperature) {
        System.out.println(String.format("Temperature is %f,humidity is %f",temperature,humidity));
    }
}

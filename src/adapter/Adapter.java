package adapter;

public class Adapter implements Target{
    private Adaptee adaptee;
    public Adapter(final Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public String call() {
        adaptee.run();
        return "nothing";
    }
}

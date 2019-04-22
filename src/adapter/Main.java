package adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        System.out.println(target.call());
    }
}

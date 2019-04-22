package strategy.first;

public class Main {
    public static void main(String[] args) {
        WalkBehavior walkBehavior = new WildWalkBehavior();
        Duck duck = new WildDuck(walkBehavior);
        System.out.println(duck.walk());
    }
}

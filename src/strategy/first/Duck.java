package strategy.first;

interface Duck {
    String fly();
    String walk();
}

interface WalkBehavior{
    String walk();
}

class WildWalkBehavior implements WalkBehavior {
    @Override
    public String walk() {
        return "Walking wildly";
    }
}
class WildDuck implements Duck{

    private WalkBehavior walkBehavior;

    public WildDuck(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    @Override
    public String fly() {
        return "Seriously wild flying";
    }

    @Override
    public String walk() {
        return walkBehavior.walk();
    }
}

class CityDuck implements Duck{
    @Override
    public String fly() {
        return "High-intensity flying";
    }

    @Override
    public String walk() {
        return "Walking casually";
    }
}

class MountainDuck implements Duck{

    @Override
    public String fly() {
        return "High-altitude flying";
    }

    @Override
    public String walk() {
        return "Flies or stands still";
    }
}

class CloudDuck implements Duck{

    @Override
    public String fly() {
        return "High-altitude flying";
    }

    @Override
    public String walk() {
        return "Fly always";
    }
}

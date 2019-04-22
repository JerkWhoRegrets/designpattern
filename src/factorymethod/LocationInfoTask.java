package factorymethod;

public class LocationInfoTask implements Task{

    @Override
    public void execute() {
        System.out.println("doing location info task by executing shell scripts");
    }
}

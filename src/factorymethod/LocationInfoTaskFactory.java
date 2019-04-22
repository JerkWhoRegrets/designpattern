package factorymethod;

public class LocationInfoTaskFactory implements TaskFactory {
    @Override
    public Task productTask() {
        return new LocationInfoTask();
    }
}

package factorymethod.first;

public class LocationInfoTaskFactory implements TaskFactory {
    @Override
    public Task productTask() {
        return new LocationInfoTask();
    }
}

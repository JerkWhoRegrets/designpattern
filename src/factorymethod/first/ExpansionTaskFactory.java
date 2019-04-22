package factorymethod.first;

public class ExpansionTaskFactory implements TaskFactory {
    @Override
    public Task productTask() {
        return new ExpansionTask();
    }
}

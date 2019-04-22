package factorymethod;

public class ExpansionTaskFactory implements TaskFactory {
    @Override
    public Task productTask() {
        return new ExpansionTask();
    }
}

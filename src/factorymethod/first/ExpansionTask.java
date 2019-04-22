package factorymethod.first;

public class ExpansionTask implements Task {
    @Override
    public void execute() {
        System.out.println("evaluating expanding task by executing shell scripts");
    }
}

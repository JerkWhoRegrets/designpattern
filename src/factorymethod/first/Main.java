package factorymethod.first;



public class Main {
    public static void main(String[] args) {
        TaskFactory taskFactory = new LocationInfoTaskFactory();
        Task task = taskFactory.productTask();
        task.execute();
    }
}

package simplefactory;

public class TaskFactoryOptionTwo {
    public static <T> BaseTask<T> healthTask(){
        return new HealthCheckTask<>();
    }

    public static <T> BaseTask<T> collectTask(){
        return new CollectionLogTask<>();
    }
}

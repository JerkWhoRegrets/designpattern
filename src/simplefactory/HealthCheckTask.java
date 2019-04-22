package simplefactory;

public class HealthCheckTask<T> extends BaseTask<T>{


    @Override
    @SuppressWarnings("all")
    public T call() throws Exception {
        System.out.println("executing inspection.sh to check server health");
        return (T)Result.success("check done");
    }
}

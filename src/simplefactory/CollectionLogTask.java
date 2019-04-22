package simplefactory;

public class CollectionLogTask<T> extends BaseTask<T>{

    @Override
    @SuppressWarnings("all")
    public T call() throws Exception {
        System.out.println("collecting logs from server");
        return (T)Result.success("done");
    }
}

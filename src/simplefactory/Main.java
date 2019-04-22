package simplefactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        BaseTask task = TaskFactoryOptionOne.getTask(TaskType.CHECK_TASK);
        executorService.submit(task);

        task = TaskFactoryOptionTwo.collectTask();
        executorService.submit(task);
    }
}

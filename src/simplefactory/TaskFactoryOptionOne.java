package simplefactory;

public class TaskFactoryOptionOne {
    public static BaseTask getTask(String taskType){
        if(TaskType.CHECK_TASK.equals(taskType)){
            return new HealthCheckTask<Result>();
        }else if(TaskType.COLLECT_TASK.equals(taskType)){
            return new CollectionLogTask<Result>();
        }else {
            throw new RuntimeException(taskType + " not supported");
        }
    }
}

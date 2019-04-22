package simplefactory;

public class Result {
    private boolean success;
    private String msg;

    private Result(){}

    private Result(boolean success,String msg) {
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }


    public String getMsg() {
        return msg;
    }


    public static Result success(String msg){
        return new Result(true,msg);
    }

    public static Result error(String msg){
        return new Result(false,msg);
    }
}

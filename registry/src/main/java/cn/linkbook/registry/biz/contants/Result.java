package cn.linkbook.registry.biz.contants;

public class Result<T> {
    private String messgae;
    private boolean success;
    private int code;
    private T data;

    public Result(){
        this.success = true;
        this.code = ReturnCodeEnum.SUCCESS.getCode();
        this.messgae = ReturnCodeEnum.SUCCESS.getMessage();
    }

    public Result(T obj){
        this.success = true;
        this.code = ReturnCodeEnum.SUCCESS.getCode();
        this.messgae = ReturnCodeEnum.SUCCESS.getMessage();
        this.data = obj;
    }

    public Result fillData(T obj){
        this.data = obj;
        return this;
    }

    public Result getFailedResult(int code, String message){
        this.success = false;
        this.setCode(code);
        this.setMessgae(message);
        return this;
    }

    public Result getFailedResult(ReturnCodeEnum returnCodeEnum){
        this.success = false;
        this.setCode(returnCodeEnum.getCode());
        this.setMessgae(returnCodeEnum.getMessage());
        return this;
    }

    public Result getFailedResult(ReturnCodeEnum returnCodeEnum, String message){
        this.success = false;
        this.setCode(returnCodeEnum.getCode());
        this.setMessgae(message);
        return this;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

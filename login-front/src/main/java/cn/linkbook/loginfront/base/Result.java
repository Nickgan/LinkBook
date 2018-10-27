package cn.linkbook.loginfront.base;


import cn.linkbook.loginfront.constants.ReturnCodeEnum;

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

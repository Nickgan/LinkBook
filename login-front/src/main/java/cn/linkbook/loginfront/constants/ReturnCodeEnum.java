package cn.linkbook.loginfront.constants;

public enum ReturnCodeEnum {
    SUCCESS(200,"成功");
    private int code;
    private String message;
    private ReturnCodeEnum(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

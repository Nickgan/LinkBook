package cn.linkbook.registry.biz.contants;

public enum ReturnCodeEnum {
    SUCCESS(200,"成功"),
    PARAM_NULL_FAILED(401, "参数为空"),
    PARAM_LENGTH_FAILED(402, "参数长度不合法");


    private int code;
    private String message;
    private ReturnCodeEnum(int code, String message){
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

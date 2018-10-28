package cn.linkbook.registry.biz.service.exceptions;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 3:52.
 * @Description 自定义邮件发送异常
 */
public class EmailSendException extends Exception {

    public EmailSendException(){}

    public EmailSendException(String msg){
        super(msg);
    }

    public EmailSendException(String msg, Exception e){
        super(msg, e);
    }

}

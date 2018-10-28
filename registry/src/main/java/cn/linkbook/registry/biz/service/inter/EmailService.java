package cn.linkbook.registry.biz.service.inter;

import cn.linkbook.registry.biz.service.Object.EmailMessage;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 3:19.
 * @Description 邮件服务
 */
public interface EmailService {

    /**
     * 发送邮件服务
     * @param msg
     * @return
     */
    void send(EmailMessage msg);
}

package cn.linkbook.registry.biz.service.impl;

import cn.linkbook.registry.biz.service.Object.EmailMessage;
import cn.linkbook.registry.biz.service.inter.EmailService;
import cn.linkbook.registry.biz.util.AsyncUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import java.util.Date;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 3:20.
 * @Description
 */
public class EmailServiceImpl extends AbstractEmailService implements EmailService {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmailServiceImpl.class);

    /**
     * 异步发送邮件
     * 163 邮箱有个坑点， 隔一段时间他会认为邮件为垃圾邮件不予发送
     * 解决办法就是发送到本邮箱，然后抄送给目标收件人
     * @return
     */
    @Override
    public void send(EmailMessage msg) {
        AsyncUtil.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    LOGGER.info("email server send code info start ...., message:{}", msg.toString());
                    SimpleMailMessage message = new SimpleMailMessage();//消息构造器
                    message.setFrom(userName);//发件人
                    message.setTo(userName);//收件人
                    message.setCc(msg.getEmailAddress());//抽送人
                    message.setSubject(msg.getTitle());//主题
                    message.setText(msg.getContent());//正文
                    message.setSentDate(new Date());
                    message.setFrom(userName);//发件人
                    javaMailSender.send(message);
                    LOGGER.info("email server send code info end ....");
                } catch (Exception e){
                    LOGGER.warn("email send failed.", e);
                }
            }
        });
    }
}

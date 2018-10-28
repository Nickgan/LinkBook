package cn.linkbook.registry.biz.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.annotation.PostConstruct;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 4:00.
 * @Description
 */
public abstract class AbstractEmailService {

    private final static Logger LOGGER = LoggerFactory.getLogger(AbstractEmailService.class);

    protected JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

    String  host;
    String  userName;
    Integer port;
    String  code;

    @PostConstruct
    public void init() {
        LOGGER.error("================ init email server start ==============");
        javaMailSender.setHost(host);//指定用来发送Email的邮件服务器主机名
        javaMailSender.setPort(port);//默认端口，标准的SMTP端口
        javaMailSender.setUsername(userName);//用户名
        javaMailSender.setPassword(code);//密码
        LOGGER.error("=============== init email server success =============");
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}

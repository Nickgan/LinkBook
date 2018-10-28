package cn.linkbook.registry.biz.service.impl;

import cn.linkbook.registry.biz.contants.Result;
import cn.linkbook.registry.biz.contants.UserState;
import cn.linkbook.registry.biz.service.Object.EmailMessage;
import cn.linkbook.registry.biz.service.inter.EmailService;
import cn.linkbook.registry.biz.service.inter.RegistryService;
import cn.linkbook.registry.biz.util.IDGen;
import cn.linkbook.registry.dal.inter.RegistryServiceDao;
import cn.linkbook.registry.dal.object.UserInfoDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 15:52.
 * @Description
 */
@Service
public class RegistryServiceImpl implements RegistryService{

    private final static Logger LOGGER = LoggerFactory.getLogger(RegistryServiceImpl.class);

    @Autowired
    private EmailService emailService;
    @Autowired
    private RegistryServiceDao registryServiceDao;

    @Override
    public Result<String> registry(UserInfoDO user) {
        // 1. 用户注册信息校验
        Result<String> valid = user.validRegistryInfo();
        if (!valid.isSuccess()){
            return valid;
        }

        // 2. 判断邮箱是否存在
        UserInfoDO exitUserInfo = registryServiceDao.query(user.getEmail());
        if (null != exitUserInfo){
            String state = exitUserInfo.getState();
            if (state.equals(UserState.wait_auth.name())){
                EmailMessage msg = new EmailMessage();
                msg.setPickName(user.getPickName());
                msg.setEmailAddress(user.getEmail());
                msg.setContentModel(EmailMessage.EmailMode.account_activation);
                emailService.send(msg);
                return new Result().getFailedResult(500, "注册失败：邮箱已经存在，请前往邮箱进行认证");
            }
            return new Result().getFailedResult(500, "注册失败：邮箱已经存在，去登录吧");
        }

        // 3. 信息入库
        user.setUuid(IDGen.generateID("USER"));
        user.setPhoto("/images/default_photo.png");
        boolean addResult = registryServiceDao.insert(user);
        if (addResult){
            // 4. 入库成功， 发送邮箱激活邮件[邮件默认都是异步发送， 所以这里默认发送都是成功的]
            EmailMessage msg = new EmailMessage();
            msg.setPickName(user.getPickName());
            msg.setTitle(EmailMessage.EmailMode.account_activation.getType());
            msg.setEmailAddress(user.getEmail());
            msg.setContentModel(EmailMessage.EmailMode.account_activation);
            emailService.send(msg);
            return new Result();
        }
        return new Result().getFailedResult(500, "内部执行错误");
    }
}

package cn.linkbook.registry.controller;

import cn.linkbook.registry.biz.contants.Result;
import cn.linkbook.registry.biz.service.inter.RegistryService;
import cn.linkbook.registry.dal.object.UserInfoDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 15:58.
 * @Description
 */
@RestController
@RequestMapping("/user")
public class RegistryController extends AjaxModel{

    private final static Logger LOGGER = LoggerFactory.getLogger(RegistryController.class);

    @Autowired
    private RegistryService registryService;

    @PostMapping("/reg")
    public void registry(@BeanParam UserInfoDO user){
        Result<String> result = registryService.registry(user);
        print(result);
    }

}

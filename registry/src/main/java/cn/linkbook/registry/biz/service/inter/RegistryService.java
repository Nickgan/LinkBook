package cn.linkbook.registry.biz.service.inter;

import cn.linkbook.registry.biz.contants.Result;
import cn.linkbook.registry.dal.object.UserInfoDO;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 15:51.
 * @Description 注册服务
 */
public interface RegistryService {


    /**
     * 新用户注册服务
     * @param user
     * @return
     */
    Result<String> registry(UserInfoDO user);
}

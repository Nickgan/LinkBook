package cn.linkbook.registry.dal.inter;

import cn.linkbook.registry.dal.object.UserInfoDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 15:39.
 * @Description
 */
public interface RegistryServiceDao {

    /**
     * 用户注册
     */
    boolean insert(UserInfoDO user);

    /**
     * 根绝邮件查询用户信息
     * 1. 判断用户是否存在
     * 2. 如果存在需要状态等信息用于业务处理
     * @param email
     * @return
     */
    UserInfoDO query(@Param("email") String email);
}

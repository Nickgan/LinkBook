package cn.linkbook.registry.dal.object;

import cn.linkbook.registry.biz.contants.Result;
import cn.linkbook.registry.biz.contants.ReturnCodeEnum;
import cn.linkbook.registry.biz.contants.UserState;
import org.springframework.util.StringUtils;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 15:10.
 * @Description
 */
public class UserInfoDO extends BaseDO{

    private String uuid;
    private String pickName;
    private String email;
    private String photo;
    private String password;
    private String mobile;
    private String weixin;
    private String qq;
    private String state;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPickName() {
        return pickName;
    }

    public void setPickName(String pickName) {
        this.pickName = pickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getState() {
        return state;
    }

    public UserState getStateEnum() {
        return UserState.valueOf(state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public Result<String> validRegistryInfo(){
        if (null == this){
            return new Result().getFailedResult(ReturnCodeEnum.PARAM_NULL_FAILED, "注册失败: 所有信息均必填");
        }
        if (StringUtils.isEmpty(this.pickName)){
            return new Result().getFailedResult(ReturnCodeEnum.PARAM_NULL_FAILED, "注册失败: 用户名不能为空");
        }
        if (StringUtils.isEmpty(this.email)){
            return new Result().getFailedResult(ReturnCodeEnum.PARAM_NULL_FAILED, "注册失败: 邮箱地址不能为空");
        }
        if (StringUtils.isEmpty(this.password)){
            return new Result().getFailedResult(ReturnCodeEnum.PARAM_NULL_FAILED, "注册失败: 密码不能为空");
        }
        if (this.pickName.length() > 15){
            return new Result().getFailedResult(ReturnCodeEnum.PARAM_NULL_FAILED, "注册失败: 用户名长度15个字以内");
        }
        if (this.password.length() < 6 || this.password.length() > 12){
            return new Result().getFailedResult(ReturnCodeEnum.PARAM_NULL_FAILED, "注册失败: 密码长度应在6~12位");
        }

        return new Result<>();
    }
}

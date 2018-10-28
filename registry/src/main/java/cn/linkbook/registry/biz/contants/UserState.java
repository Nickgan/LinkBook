package cn.linkbook.registry.biz.contants;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 15:16.
 * @Description 用户状态
 */
public enum  UserState {

    wait_auth("邮箱未认证"),
    wait_perfect("待完善信息"),
    finish("信息完整"),
    exception("账号异常"),
    stop_using("禁止使用");

    private String state;

    UserState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

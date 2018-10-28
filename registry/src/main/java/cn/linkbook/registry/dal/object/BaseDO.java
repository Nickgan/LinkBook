package cn.linkbook.registry.dal.object;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/27 21:23.
 * @Description
 */
public abstract class BaseDO {

    protected Integer id;
    protected String extraInfo;
    protected Timestamp createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public JSONObject getExtraInfoJson() {
        if (StringUtils.isEmpty(extraInfo)){
            return null;
        }
        return JSONObject.parseObject(extraInfo);
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}

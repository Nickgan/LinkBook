package cn.linkbook.registry.controller;

import cn.linkbook.registry.biz.contants.Result;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 16:03.
 * @Description
 */
public class AjaxModel {


    private final static Logger logger = LoggerFactory.getLogger(AjaxModel.class);

    @Autowired
    private HttpServletResponse response;

    public void print(Result data){
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf8");
            out = response.getWriter();
            JSONObject result = new JSONObject();
            result.put("success", data.isSuccess());
            result.put("code", data.getCode());
            result.put("desc", data.getMessgae());
            result.put("data", data.getData());
            String responseStr = "("+result.toJSONString()+")";
            System.out.println("response:"+responseStr);
            out.print("("+result.toJSONString()+")");
        } catch (Exception e){
            logger.error("print api result error. e={}", e);
            JSONObject json = new JSONObject();
            json.put("success", false);
            json.put("code", "500");
            json.put("message", "内部执行错误");
            out.print("(" + json.toJSONString() + ")");
        } finally {
            out.flush();
            out.close();
        }
        return;
    }

    // 简单的防XSS注入
    public String filterXss(String str){
        return str.replaceAll("<", "&lt").replaceAll(">", "&gt");
    }
}

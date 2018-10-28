package cn.linkbook.registry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/27 21:55.
 * @Description
 */
@Controller
public class PageController {

    @GetMapping(value = {"/", "/reg"})
    public String reg(){
        return "reg";
    }

    @GetMapping("/to/{html}")
    public String toPage(@PathVariable String html){
        return html;
    }
}

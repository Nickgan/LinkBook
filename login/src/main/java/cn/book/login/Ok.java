package cn.book.login;

import cn.book.login.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linkbook")
public class Ok {

    @GetMapping("/ok")
    public Result<String> ok(){
        Result<String> result = new Result<>("ok");
        return result;
    }
}

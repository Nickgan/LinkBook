package cn.linkbook.loginfront.login;

import cn.linkbook.loginfront.base.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/linkbook")
public class Login {
    @Value("${okService.url}")
    private String ok;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/login")
    public Result login(){
        return restTemplate.getForObject(ok + "/ok",Result.class);
    }
}

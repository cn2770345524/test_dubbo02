package cn.liuhao.consumer.controller;

import cn.liuhao.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @RequestMapping("demo01")
    public Object demo01(){

        return demoService.sayHello();
    }

    @RequestMapping("demo02")
    public Object demo02(){

        return demoService.getUser();
    }

}

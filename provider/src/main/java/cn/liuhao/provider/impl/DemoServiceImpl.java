package cn.liuhao.provider.impl;

import cn.liuhao.api.pojo.User;
import cn.liuhao.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "hello world";
    }

    @Override
    public User getUser() {
        return new User(1,"zhangsan",99.9);
    }
}

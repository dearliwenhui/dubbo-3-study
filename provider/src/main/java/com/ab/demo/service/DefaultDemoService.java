package com.ab.demo.service;

import com.ab.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @description:
 * @version: 0.0.1
 * @author: liwenhui
 * @createTime: 2022-07-24 14:22
 **/
@DubboService(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}

package com.ab;

import com.ab.demo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @version: 0.0.1
 * @author: liwenhui
 * @createTime: 2022-07-24 15:16
 **/
@SpringBootApplication
@Slf4j
public class ConsumerApplication {

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;


    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> log.info(demoService.sayHello("mercyblitz"));
    }

}

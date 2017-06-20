package com.alabada;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {
    // @RequestMapping注解提供路由信息
    // @RestController注解告诉Spring以字符串的形式渲染结果，并直接返回个调用者
    // @EnableAutoConfiguration注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
    @RequestMapping("/")
    String home() {

        return "Hello World!";
    }


    /**
     * main方法通过调用run，将业务委托给Spring Boot的SpringApplication类。
     * SpringApplication将引导我们的应用，启动Spring，相应地启动被自动配置的Tomcat web服务器
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}

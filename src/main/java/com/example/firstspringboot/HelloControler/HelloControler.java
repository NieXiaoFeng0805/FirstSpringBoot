package com.example.firstspringboot.HelloControler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloControler
 * @Description TODO
 * @Author nxl
 * #@Date 2023/12/8 16:57
 **/
//该注解是 @Controller 和 @ResponseBody 注解的合体版
@RestController
public class HelloControler {
    //获取配置文件中的属性
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    @RequestMapping("/hello")
    public String get() {
//        return "hello Spring Boot!";
        return name + ":" + age;
    }

}

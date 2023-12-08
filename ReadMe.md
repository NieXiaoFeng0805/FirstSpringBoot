# 快速搭建Spring Boot

File ==> New ==> Project ==> Spring Initializr

![image-20231208155547880](F:\IDEAF\FirstSpringBootProject\ReamdMe\image-20231208155547880.png)

![image-20231208155734770](F:\IDEAF\FirstSpringBootProject\ReamdMe\image-20231208155734770.png)

![image-20231208161323496](F:\IDEAF\FirstSpringBootProject\ReamdMe\image-20231208161323496.png)

# 项目结构

- BootcreateApplication： 一个带有 main() 方法的类，用于启动应用程序

![image-20231208160418926](F:\IDEAF\FirstSpringBootProject\ReamdMe\image-20231208160134875.png)

- BootcreateApplicationTests：一个空的 Junit 测试了，它加载了一个使用 Spring Boot 字典配置功能的 Spring 应用程序上下文
- application.properties：一个空的 properties 文件，可以根据需要添加配置属性
- pom.xml： Maven 构建说明文件

![image-20231208160524811](F:\IDEAF\FirstSpringBootProject\ReamdMe\image-20231208160524811.png)

# Hello Controler

## 在BootcreateApplication所在包内新建包并创建一个HelloControler类

```java
package com.example.firstspringbootproject.controller;

/**
 * @ClassName HelloControler
 * @Description TODO
 * @Author nxl
 * #@Date 2023/12/8 16:10
 **/


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//该注解是 @Controller 和 @ResponseBody 注解的合体版
@RestController
public class HelloControler {
    @RequestMapping("/hello")
    public String get(){
        return "Hello Spring boot!";
    }
}
```

## 回到BootcreateApplication类中启动程序

![image-20231208162220252](F:\IDEAF\FirstSpringBootProject\ReamdMe\image-20231208162220252.png)
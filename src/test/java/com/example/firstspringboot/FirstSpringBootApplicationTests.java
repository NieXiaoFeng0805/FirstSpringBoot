package com.example.firstspringboot;

import com.example.firstspringboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Feng
 * @Description //TODO
 * @Date 14:37 2023/12/13
 * @Param
 * @return
 **/

//进行单元测试
@SpringBootTest
class FirstSpringBootApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}

package com.example.mybatisplusdemo;

import com.example.mybatisplusdemo.entity.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;


   @Test
    public void userMapperTest() {
       User zhangsan = userMapper.selectByIdAndUsername("zhangsan", 18);
       System.out.println(zhangsan);
   }

}

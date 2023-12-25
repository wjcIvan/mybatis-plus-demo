package com.example.mybatisplusdemo.mapper;

import com.example.mybatisplusdemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    User selectByIdAndUsername(@Param("username") String username, @Param("age") int age);
}





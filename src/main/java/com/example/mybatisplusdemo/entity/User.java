package com.example.mybatisplusdemo.entity;



import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName tb_user
*/
@TableName("tb_user")
public class User implements Serializable {

    /**
    *
    */
    private Integer id;
    /**
    *
    */
    private String username;
    /**
    *
    */
    private String password;
    private Integer age;

    /**
    *
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    *
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    *
    */
    private void setPassword(String password){
    this.password = password;
    }

    /**
    *
    */
    private void setAge(Integer age){
    this.age = age;
    }


    /**
    *
    */
    private Integer getId(){
    return this.id;
    }

    /**
    *
    */
    private String getUsername(){
    return this.username;
    }

    /**
    *
    */
    private String getPassword(){
    return this.password;
    }

    /**
    *
    */
    private Integer getAge(){
    return this.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}

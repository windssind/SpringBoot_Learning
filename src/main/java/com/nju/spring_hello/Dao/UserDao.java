package com.nju.spring_hello.Dao;

import com.nju.spring_hello.Data.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    // save a user
    public String saveUser(User user);
    public User getUserByUsername(String username);
}

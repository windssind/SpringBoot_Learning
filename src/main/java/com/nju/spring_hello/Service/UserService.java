package com.nju.spring_hello.Service;

import com.nju.spring_hello.Data.User;
import com.nju.spring_hello.Data.Wish;

public interface UserService {
    // 用户注册
    public String save(User user);
    public UserVO login(String username, String password);
    //public String addWish(Wish wish);
    //public boolean saveWish(String userid, Wish wish);
}

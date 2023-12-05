package com.nju.spring_hello.Controller;

import com.nju.spring_hello.Data.User;
import com.nju.spring_hello.Service.UserService;
import com.nju.spring_hello.Service.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService; // 这里相当于提供了一个调用service的接口
    @PostMapping("/register")
    public String register(@RequestBody UserForm userForm){
        System.out.println(userForm.toString());
        User user = new User();
        BeanUtils.copyProperties(userForm,user);
        return userService.save(user);
        // 有个疑问，这里的uid还没有设置呢？按理来说uid是我们自己分配的
    }
    @PostMapping("/login")
    public UserVO login(@RequestBody LoginForm loginForm){
        System.out.println(loginForm.toString());
        return userService.login(loginForm.getUsername(),loginForm.getPassword());
    }
}

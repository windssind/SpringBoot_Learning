package com.nju.spring_hello.Service;

import com.nju.spring_hello.Dao.UserDao;
import com.nju.spring_hello.Data.User;
import com.nju.spring_hello.Data.Wish;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao; // Dao是一个
    @Override
    public String save(User user) {
        try {
            userDao.saveUser(user);
            return "save user succeed\n";
        }catch (Exception e){
            e.printStackTrace();
            return "fatal: save user failed\n";
        }
    }

    @Override
    public UserVO login(String username, String password) {
        User user_Info = userDao.getUserByUsername(username);
        System.out.println(user_Info.toString());
        if (user_Info == null) {
            System.out.println("username not exist\n");
            return null;
        }
        if (!user_Info.getPassword().equals(password)){
            System.out.println("wrong password\n");
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user_Info, userVO);
        System.out.println(userVO.toString());
        return userVO;
    }

    /*@Override
    public String addWish(Wish wish){
        if (wish == null) return "you enter a null wish\n";
        try {

        }
    }*/
}

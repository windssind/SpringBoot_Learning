package com.nju.spring_hello.Service;

import com.nju.spring_hello.Dao.WishDao;
import com.nju.spring_hello.Data.Wish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface WishService {
    public String saveWish(Wish wish);
    public Wish[] getWishesByUid(Integer uid);
}

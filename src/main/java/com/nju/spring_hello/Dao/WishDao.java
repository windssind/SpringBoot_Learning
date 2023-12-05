package com.nju.spring_hello.Dao;

import com.nju.spring_hello.Data.User;
import com.nju.spring_hello.Data.Wish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WishDao {
    public boolean saveWish(int uid,String username,String sex, String wish);
    public Wish[] getWishesByUid(Integer uid);
}

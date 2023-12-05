package com.nju.spring_hello.Service;

import com.nju.spring_hello.Dao.WishDao;
import com.nju.spring_hello.Data.Wish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService {

    // TODO: 如何让数据库返回的数据对应一个java数组
    // TODO： 所有的功能都需要通过mapping来访问吗
    @Autowired
    WishDao wishDao;
    public boolean saveWish(Wish wish){
        return wishDao.saveWish(wish.getUid(),wish.getUsername(), wish.getSex(),wish.getWish());
    }
    public Wish[] getWishesByUid(int uid){
        return wishDao.getWishesByUid(uid);
    }
}

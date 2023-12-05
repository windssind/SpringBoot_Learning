package com.nju.spring_hello.Controller;

import com.nju.spring_hello.Data.Wish;
import com.nju.spring_hello.Service.WishService;
import com.nju.spring_hello.Service.WishVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")
public class WishController {
    @Autowired
    WishService wishService;
    @PostMapping("save")
    public boolean saveWish(@RequestBody WishForm wishForm){
        if (wishForm == null) {
            System.out.println("null wish\n");
            return false;
        }
        Wish wish = new Wish();
        BeanUtils.copyProperties(wishForm, wish);
        return wishService.saveWish(wish);
    }


    @PostMapping("/get")
    public WishVO[] getWishesByUid(int uid){
        Wish[] wishes = wishService.getWishesByUid(uid);
        if (wishes == null) return null;
        WishVO[] wishVOS = new WishVO[wishes.length];
        for (int i = 0; i < wishVOS.length; ++i){
            BeanUtils.copyProperties(wishes[i], wishVOS[i]);
        }
        return wishVOS;
    }
}

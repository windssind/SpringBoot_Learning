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
    public String saveWish(@RequestBody WishForm wishForm){
        if (wishForm == null) {
            System.out.println("null wish\n");
            return "please check carefully of your input\n";
        }
        Wish wish = new Wish();
        BeanUtils.copyProperties(wishForm, wish);
        return wishService.saveWish(wish);
    }


    @PostMapping("/get")
    public WishVO[] getWishesByUid(@RequestBody GetWishForm getWishForm){
        System.out.println(getWishForm.getUid());
        Wish[] wishes = wishService.getWishesByUid(getWishForm.getUid());
        if (wishes == null) {
            System.out.println("wished is null\n");
            return null;
        }
        WishVO[] wishVOS = new WishVO[wishes.length];
        for (int i = 0; i < wishVOS.length; ++i){
            wishVOS[i] = new WishVO();
            BeanUtils.copyProperties(wishes[i], wishVOS[i]);
        }
        return wishVOS;
    }
}

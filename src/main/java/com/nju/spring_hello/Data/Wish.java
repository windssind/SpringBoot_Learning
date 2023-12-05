package com.nju.spring_hello.Data;

public class Wish {
    private String wish;
    private String sex;
    private String username;
    private int uid; // 唯一标识一个用户

    /*public Wish(int uid, String sex, String wish) {
        this.uid = uid;
        this.sex = sex;
        this.wish = wish;
    }*/

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

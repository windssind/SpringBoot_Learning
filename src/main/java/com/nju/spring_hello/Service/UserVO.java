package com.nju.spring_hello.Service;

public class UserVO {
    private int uid;
    private String username;

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

    @Override
    public String toString() {
        return "UserVO{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                '}';
    }
}

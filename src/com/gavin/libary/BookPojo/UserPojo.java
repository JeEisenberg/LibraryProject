package com.gavin.libary.BookPojo;

import java.io.Serializable;

public class UserPojo implements Serializable {
    String uid;
    String userName;
    String userPwd;

    public UserPojo() {
    }

    public UserPojo(String userName, String userPwd) {

        this.userName = userName;
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}

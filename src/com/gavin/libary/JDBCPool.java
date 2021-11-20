package com.gavin.libary;


import com.gavin.libary.BookPojo.UserPojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPool {

    final static String NAME = "gavin";
    final static String PASSWORD = "955945";

    final static String URL = "jdbc:mysql://127.0.0.1:3306/gavin?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&cachePrepStmts=true&reWriteBatchedStatements=true&useServerPrepStmts=true";
    final static String SQL = "select userName,userPwd from userinfo where userName=? and userPwd =?";
    static String userName;
    static String userPwd;

    //登陆前的检查----检查到了返回一个用户信息
    static UserPojo loginCheck(String user, String pwd) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
           //预编译
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pwd);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (null != resultSet) {
                resultSet.next();
                userName = resultSet.getString("userName");
                userPwd = resultSet.getString("userPwd");
                UserPojo userPojo = new UserPojo(userName, userPwd);
                return userPojo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

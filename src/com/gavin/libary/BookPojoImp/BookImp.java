package com.gavin.libary.BookPojoImp;

import com.gavin.libary.BookPojo.BookPojo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookImp implements SearchBook {
    final static String NAME = "gavin";
    final static String PASSWORD = "955945";
    final static String MyDRIVER = "com.mysql.cj.jdbc.Driver";
    final static String URL = "jdbc:mysql://127.0.0.1:3306/gavin?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&cachePrepStmts=true&reWriteBatchedStatements=true&useServerPrepStmts=true";
    final static String SQL = "select * from bookstore;";
    static List<BookPojo> list = new ArrayList<>();
    Connection connection =null;
    Statement statement =null;
    ResultSet resultSet =null;
    @Override
    public List<BookPojo> findAll()  {
        try {
            Class.forName(MyDRIVER);
            connection=   DriverManager.getConnection(URL, NAME, PASSWORD);
            statement =   connection.createStatement();
         resultSet=   statement.executeQuery(SQL);
            if (null != resultSet) {
                while (resultSet.next()) {
                 Integer bookId = resultSet.getInt("BookId");
                    String bookName = resultSet.getString("BookName");
                    String bookPublish = resultSet.getString("BookPublish");
                  Double bookPrice = resultSet.getDouble("BookPrice");
                    String bookKind = resultSet.getString("BookKind");
                    BookPojo bookPojo = new BookPojo(bookId, bookName, bookPublish, bookPrice, bookKind);
                    list.add(bookPojo);
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null!=resultSet)
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(null!=statement)
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(null!=connection)
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}

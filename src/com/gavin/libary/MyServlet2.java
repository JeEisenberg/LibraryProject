package com.gavin.libary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
//这里是绝对路径
@WebServlet(urlPatterns = "/MyServlet2.do")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//获得请求行的信息
        String user = req.getParameter("user");
        String pwd = req.getParameter("pwd");
        System.out.println(user);
        System.out.println(pwd);

        //设置请求域中的信息
        //req.setAttribute("");
    }
}

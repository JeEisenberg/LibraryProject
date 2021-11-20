package com.gavin.libary;

import com.gavin.libary.BookPojo.UserPojo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//这里是绝对路径
@WebServlet(urlPatterns = "/MyServlet1.do")
public class MyServlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获得用户输入内容
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        UserPojo userPojo1 = JDBCPool.loginCheck(username, pwd);
        //如果用户不为空
        if(null!=userPojo1){
            HttpSession session = req.getSession();
            session.setAttribute("USER",userPojo1);
            //找到用户后将请求转发到
            req.getRequestDispatcher("/CheckDemo.do").forward(req,resp);
        }else{//否则重定向到index
            resp.sendRedirect(req.getContextPath()+"/index.html");
        }
    }
}

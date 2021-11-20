package com.gavin.libary;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
* @Description 用于检查是否是登陆状态
 * @Author GAVIN
 * @DATE 2021-10-17
*
*
* */


@WebServlet(urlPatterns = "/CheckDemo.do")
public class CheckDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//得到session
        HttpSession session = req.getSession();
        Object userPojo = session.getAttribute("USER");
        if(null!=userPojo){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("BookServlet.do");
            requestDispatcher.forward(req,resp);
        }else{
            resp.sendRedirect("index.html");
        }
    }
}

package com.gavin.libary;

import com.gavin.libary.BookPojo.BookPojo;
import com.gavin.libary.BookPojoImp.BookImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BookServlet.do")
public class BookServlet extends HttpServlet {
    BookImp Book= new BookImp();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BookPojo> all = Book.findAll();
        req.setAttribute("BookInfo",all);
        req.getRequestDispatcher("BookStore.jsp").forward(req,resp);
    }
}

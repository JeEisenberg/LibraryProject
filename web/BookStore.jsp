<%--
  Created by IntelliJ IDEA.
  User: Gavin
  Date: 2021/10/20
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.gavin.libary.BookPojo.BookPojo" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <title>欢迎使用图书管理系统</title>
    <style type="text/css">
        table {
            border: 4px solid black;
            width: 80%;
            margin: 0px auto;
            mso-cellspacing: 0px;
        }

        td {
            border:2px solid black;

        }

        th {
            border: 2px solid black;

        }

    </style>
</head>
<body>
<div>
    <table cellpadding="0px" cellspacing="0px">
        <tr>

            <th>BookId</th>
            <th>BookName</th>
            <th>BookPublish</th>
            <th>BookPrice</th>
            <th>BookKind</th>
        </tr>
        <%
            List<BookPojo> bookInfo =(ArrayList) request.getAttribute("BookInfo");
            for (BookPojo bookPojo : bookInfo) {
        %>

        <tr>
            <td><%=bookPojo.getBookId()%></td>
            <td><%=bookPojo.getBookName()%></td>
            <td><%=bookPojo.getBookPublish()%></td>
            <td><%=bookPojo.getBookPrice()%></td>
            <td><%=bookPojo.getBookKind()%></td>
        </tr>
      <%
          }
      %>
    </table>
</div>
</body>
</html>

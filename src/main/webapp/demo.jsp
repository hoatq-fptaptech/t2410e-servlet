<%--
  Created by IntelliJ IDEA.
  User: quanghoatrinh
  Date: 24/3/26
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Demo JSP page</h1>
    <h2>Hello <%= request.getAttribute("abc") %></h2>
    <h2>Hello <%= request.getAttribute("xyz") %></h2>
    <form action="" method="POST">
        <input name="search" type="text" placeholder="Enter..."/>
        <button type="submit">Search</button>
    </form>
</body>
</html>

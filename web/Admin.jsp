<%-- 
    Document   : Admin
    Created on : 10 Jun, 2020, 12:52:40 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
        <h1>Welcome</h1>
       <form action="CheckCorrection">
       <input type="submit" value=" Check Corrections" name=" Check Corrections" />
       </form>
        <br>
        <form action="QueryCheck"><input type="submit" value="Check New Queries" name="Check New Queries" />
        </form>
        <br>
        <form action="AddQuery.jsp"><input type="submit" value="Add Query" name="Add Query" />
        </form>
            </center></body>
</html>

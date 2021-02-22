<%-- 
    Document   : login
    Created on : 10 Jun, 2020, 12:53:32 AM
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
    <body>
        <center>  <h1>Login</h1>
            <form action="VerifyAdmin">
           UserID<input type="text" name="UserID" value="" size="10" />
            Password<input type="password" name="Password" value="" size="10" />
            <input type="submit" value="Log in" name="Log in" />
            </form>

 </center>
        </body>
</html>

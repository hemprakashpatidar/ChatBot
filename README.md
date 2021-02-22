# ChatBot
<%-- 
    Document   : index
    
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat Bot</title>
    </head>
    <body><center>
        <h1>Welcome to College Enquiry chatBot</h1>
        <br>
        ChatBot <form action="checkBot.jsp">
            <input type="submit" value="Bot" />
        </form>
        <br>
        <form action="FAQ.jsp">
            <input type="submit" value="General Questions" />
        </form>
        <br>
         <form action="Correction.jsp">
            <input type="submit" value="Correction" name="Correction" />
        </form>
        <br>
         <form action="NewQuery.jsp">
            <input type="submit" value="Querry Not Found" name="Querry Not Found" />
        </form>
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
        <br>
       
        <form action="login.jsp">
            <input type="submit" value="Login" name="Login" />
        </form>
    </center></body>
</html>

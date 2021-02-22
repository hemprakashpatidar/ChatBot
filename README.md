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

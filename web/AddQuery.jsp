<%-- 
    Document   : AddQuery
    Created on : 11 Jun, 2020, 1:29:33 AM
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

            <h3>Add Query</h3>
            <form action="AddQueryJ">
            

           Query <input type="text" name="Query1" value="" size="10" />
            <br><br>
            Alternate<input type="text" name="Query2" value="" size="10" />
            <br><br>
            Answer<input type="text" name="Answer" value="" size="10" />
            <br><br>
            <input type="submit" value="Add" name="Add" />
            </form>

        </center>
    </body>
</html>

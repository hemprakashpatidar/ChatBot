<%-- 
    Document   : Correction
    Created on : 10 Jun, 2020, 1:34:29 AM
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
       <center>
           <h3>Enter your corrections</h3>
           <br>
                <form name="Correct" action="Corrections">
                    Old Answer<input type="text" name="OldAns" value="" size="10" /><br><br>
                    New Answer<input type="text" name="NewAns" value="" size="10" /><br><br>
               <input type="submit" value="Submit" name="Submit" />
           </form>



           </center>
    </body>
</html>

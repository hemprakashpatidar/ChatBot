/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Bott.dbms;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name="AddQueryJ", urlPatterns={"/AddQueryJ"})
public class AddQueryJa extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String q=request.getParameter("Query1");
            String q1=request.getParameter("Query2");
            String ans=request.getParameter("Answer");

           Class.forName("com.mysql.jdbc.Driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
//System.out.println("Driver");
 Statement stmt= (Statement) con.createStatement();
//System.out.println("Driver");
       ResultSet rs = stmt.executeQuery("select max(id) from Question");
       boolean b= rs.next();
        int n=(int)rs.getLong(1)+1;
        //String q="ksjdf";
        String a="insert into Ques values("+n+", '"+q+"')";
 stmt.executeUpdate(a);
 n=n+1;
 String a1="insert into Ques values("+n+", '"+q1+"')";
 stmt.executeUpdate(a1);
 ResultSet rs1 = stmt.executeQuery("select max(id) from Answer");
       boolean b1= rs1.next();
        int m=(int)rs.getLong(1)+1;
        //String q="ksjdf";
        String a2="insert into answ values("+m+", '"+ans+"')";
 stmt.executeUpdate(a2);

            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddQueryJ</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddQueryJ at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
        catch(Exception e){}
        finally {
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

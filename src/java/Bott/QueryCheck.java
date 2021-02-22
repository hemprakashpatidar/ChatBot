/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bott;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author HP
 */
@WebServlet(name="QueryCheck", urlPatterns={"/QueryCheck"})
public class QueryCheck extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specifi
     *
     *  error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           Class.forName("com.mysql.jdbc.Driver");
    //        String g[]= new String[10];
      //  dbms d=new dbms();
        //dbms.main(g);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
        Statement stmt=con.createStatement();
         ResultSet rs = stmt.executeQuery("select * from newquery");
     //  boolean b= rs.next();

          
        out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet QueryCheck</title>");  
            out.println("</head>");
            out.println("<body> <center> <h2> New Queries <h2> </center>");
            while(rs.next())
            { String ch=rs.getString(2);
            out.println("<h4> Q- " + ch + "</h4>");
                }
            out.println("</body>");
            out.println("</html>");
           
        }
        catch(Exception e){
        out.print("gakat ");
        }
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

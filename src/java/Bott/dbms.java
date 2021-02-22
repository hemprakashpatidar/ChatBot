package Bott;
import java.sql.*;
public class dbms{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{}
public void add(String q, String q1, String ans) throws ClassNotFoundException, SQLException{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
//System.out.println("Driver");
 Statement stmt= con.createStatement();
//System.out.println("Driver");
       ResultSet rs = stmt.executeQuery("select max(id) from Ques");
       boolean b= rs.next();
        int n=(int)rs.getLong(1)+1;
        //String q="ksjdf";
        String a="insert into Ques values("+n+", '"+q+"')";
 stmt.executeUpdate(a);
 n=n+1;
 String a1="insert into Ques values("+n+", '"+q1+"')";
 stmt.executeUpdate(a1);
 Statement stmt1=con.createStatement();
 ResultSet rs1 = stmt1.executeQuery("select max(id) from Answ");
       boolean b1= rs1.next();
        int m=(int)rs1.getLong(1)+1;
        //String q="ksjdf";
    //    String ad="insert into answer values(1,'"+"asjd"+"')";
      //  stmt.executeUpdate(ad);
        String a2="insert into Answ values("+m+", '"+ans+"')";
 stmt1.executeUpdate(a2);
// System.out.println(rs.getString(2));
}

}

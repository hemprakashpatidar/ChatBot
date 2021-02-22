package Bott;
import java.sql.*;
public class vvvv{
public static void main(String args[]) throws ClassNotFoundException, SQLException
        {


}
public String[] sq() throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
Statement stmt= con.createStatement();
ResultSet ds=stmt.executeQuery("select max(id) from NewQuery");
        boolean next = ds.next();
        int n=ds.getInt(1);
int t=0;
String result[]=new String[n];
ResultSet rs=stmt.executeQuery("select * from NewQuery");
        
while(rs.next())
result[t++]="Q-"+rs.getString(2);
return result;
}
}

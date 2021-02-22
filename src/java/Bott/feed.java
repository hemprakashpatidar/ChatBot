package Bott;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class feed{
    static int l=0;
    static String[] st=new String[100];
    static String[] at=new String[100];
public static void main(String args[]){

feed ss=new feed();
String f[]=ss.mt();
int d=f.length;
System.out.print(d);
}
public void leng(){
try{Class.forName("com.mysql.jdbc.Driver");
    //        String g[]= new String[10];
      //  dbms d=new dbms();
        //dbms.main(g);
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
        Statement stmt=(Statement) con.createStatement();
       ResultSet rs = stmt.executeQuery("select max(id) from newQuery");
       boolean b=rs.next();

        l=Integer.parseInt(rs.getString(1));
       ResultSet rs1 = stmt.executeQuery("select * from ques");

        int i=0;
        //st[i]=rs.getString(2);
        while(rs1.next()){st[i++]=rs1.getString(2);}
        ResultSet rs2 = stmt.executeQuery("select * from answ");

        int j=0;
        //st[i]=rs.getString(2);
        while(rs2.next()){at[j++]=rs2.getString(2);}

}
 catch(Exception e){}

       //  boolean b=rs.next();
         //

}
public int gg(){
    feed ff=new feed();
    ff.leng();
return l;
}
public String[] mt()
    {
     feed ff=new feed();
    ff.leng();
return st;
    }
public String[] mt1()
    {
     feed ff=new feed();
    ff.leng();
return at;
    }

}
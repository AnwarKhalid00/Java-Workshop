package Day27;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class My_SQl {
    public static void main(String[] args) {
        try
        {
            String url ="jdbc:mysql://localhost:3306/db";
            String uname = "root";
            String pass = "root";
            String query ="select name from mytable where age = 18"; 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            /*while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Name: "+name+" "+"Age: "+age);
            }*/
            rs.next();
            String name = rs.getString("name");
            System.out.println(name);
            
            st.close();
            con.close();
            //System.out.println(con);
             
        }
        catch(Exception e)
        {
            
        }
    }
}

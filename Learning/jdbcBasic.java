import java.io.*;
import java.sql.*;

public class jdbcBasic {
    
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/dn1"; //database details
        String username = "root";
        String password = "pesu123";
        String query = "SELECT * FROM users";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established successfully.");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){

            String name = rs.getString("username");
            System.out.println(name);
        }

        st.close();
        con.close();
        System.out.println("Connection closed.");
    }
}

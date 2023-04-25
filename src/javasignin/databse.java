
package javasignin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databse {
    public static Connection mycon(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signin_login", "root", "");
            
            
            
        } catch (ClassNotFoundException | SQLException e ){
            System.out.println(e);
        }
        return con;
    }

    static Object getConection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

package Package01;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Mysqlconnect 
{
    static Connection ConnectDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn= null;
    public static Connection ConnectDB(String url)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,"root","Root");
            return conn;
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

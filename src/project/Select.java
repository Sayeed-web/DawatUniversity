
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class Select {
    public static ResultSet getData(String query)
    {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            conn=ConnectionProvider.getCon();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(query);
            return rs;
            
        }    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
                    return null;

        }        
    }        
}

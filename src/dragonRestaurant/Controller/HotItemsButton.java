
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Beverages.BeveragesTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class HotItemsButton {
    public void actionPerformed(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_beverages";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String hQuery="Select * From hot_items";
            PreparedStatement query=connect.prepareStatement(hQuery);
            ResultSet rs=query.executeQuery();
            BeveragesTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Hot Items Button is not Working");
        }
    }
}

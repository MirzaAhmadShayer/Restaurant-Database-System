
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Beverages.BeveragesTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class SoftDrinksButton {
     public void actionPerformed(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_beverages";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String sdQuery="Select * From soft_drinks";
            PreparedStatement query=connect.prepareStatement(sdQuery);
            ResultSet rs=query.executeQuery();
            BeveragesTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Soft Drinks Button is not Working");
        }
    }
}

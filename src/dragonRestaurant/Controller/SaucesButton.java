
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Extras.ExtrasTable;
import static dragonRestaurant.Model.Extras.SaucesButton;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class SaucesButton {
   public void actionPerformed(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_extras";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            if(SaucesButton.isSelected()){
                String sQuery="Select * from sauces";
                PreparedStatement query=connect.prepareStatement(sQuery);
                ResultSet rs=query.executeQuery();
                ExtrasTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Sauces Button is not responding");
        }
   } 
}

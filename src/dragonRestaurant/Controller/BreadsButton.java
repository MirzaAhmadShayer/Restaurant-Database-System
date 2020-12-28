
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Extras.BreadsButton;
import static dragonRestaurant.Model.Extras.ExtrasTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class BreadsButton {
    public void actionPerformed(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_extras";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            if(BreadsButton.isSelected()){
                String brQuery="Select * from breads";
                PreparedStatement query=connect.prepareStatement(brQuery);
                ResultSet rs=query.executeQuery();
                ExtrasTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Breads Button is not responding");
        }
    }
}

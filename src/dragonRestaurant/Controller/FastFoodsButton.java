
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Appetizers.AppetizersTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class FastFoodsButton {
    public void actionPerformed(){
          try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_appetizers";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String sdQuery="Select * From fast_food";
            PreparedStatement query=connect.prepareStatement(sdQuery);
            ResultSet rs=query.executeQuery();
            AppetizersTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Fast Foods Button is not Working");
        }
    }
}

package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Extras.BiscuitsButton;
import static dragonRestaurant.Model.Extras.ExtrasTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class BiscuitsButton {
    public void actionPerformed(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_extras";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            if(BiscuitsButton.isSelected()){
                String biQuery="Select * from biscuits";
                PreparedStatement query=connect.prepareStatement(biQuery);
                ResultSet rs=query.executeQuery();
                ExtrasTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Biscuits Button is not responding");
        }
    }
}

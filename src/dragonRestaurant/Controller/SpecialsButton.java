package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.Specials.SpecialsButton;
import static dragonRestaurant.Model.Specials.SpecialsTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class SpecialsButton {
    public void actionPerformed(){
    try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_specials";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            if(SpecialsButton.isSelected()){
                String speQuery="Select * from specials";
                PreparedStatement query=connect.prepareStatement(speQuery);
                ResultSet rs=query.executeQuery();
                SpecialsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "The Specials Button is not responding");
        }
    }
}

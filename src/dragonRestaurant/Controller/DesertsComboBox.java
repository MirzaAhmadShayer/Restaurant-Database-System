
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static dragonRestaurant.Model.Deserts.DesertsComboBox;
import static dragonRestaurant.Model.Deserts.DesertsTable;

public class DesertsComboBox {
    public void actionPerformed(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_deserts";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String selectedItem=DesertsComboBox.getSelectedItem().toString();
            String dQuery;
            
            if(selectedItem.equals("Select...")){
                JOptionPane.showMessageDialog(null, "Please Select an Item!!");
            }
            if(selectedItem.equals("Cakes")){
                dQuery="Select * from cakes";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Donuts")){
                dQuery="Select * from donuts";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Ice Cream")){
                dQuery="Select * from ice_cream";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Muffins")){
                dQuery="Select * from muffins";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Sweets")){
                dQuery="Select * from sweets";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
             
         }
         catch(HeadlessException | ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null, "Deserts Select Box Not Working!");
         } 
    }
}

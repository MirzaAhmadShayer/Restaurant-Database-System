
package dragonRestaurant.Controller;

import com.mysql.jdbc.Connection;
import static dragonRestaurant.Model.MainCourses.MainCoursesComboBox;
import static dragonRestaurant.Model.MainCourses.MainCoursesTable;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class MainCoursesComboBox {
    public void actionPerformed(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_maincourses";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String selectedItem=MainCoursesComboBox.getSelectedItem().toString();
            String mcQuery;
            
            if(selectedItem.equals("Select...")){
                JOptionPane.showMessageDialog(null, "Please Select an Item!!");
            }
            if(selectedItem.equals("Beef")){
                mcQuery="Select * from beef";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Chicken")){
                mcQuery="Select * from chicken";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Egg")){
                mcQuery="Select * from egg";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Fish")){
                mcQuery="Select * from fish";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Rice")){
                mcQuery="Select * from rice";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Vegetable")){
                mcQuery="Select * from vegetable";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
             
         }
         catch(HeadlessException | ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null, "Main Courses Select Box Not Working!");
         } 
    }
}

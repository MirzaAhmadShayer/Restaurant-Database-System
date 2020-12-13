package dragonRestaurant.Controller;

import dragonRestaurant.Model.MainGUI;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ResetFullOrderButton {
    public void ActionPerformed(ActionEvent e){
        DefaultTableModel tmb = (DefaultTableModel) MainGUI.OrdersTable.getModel();
        if(MainGUI.OrdersTable.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "THE TABLE IS ALREADY EMPTY");
        }
        else{
            int rowRemove = MainGUI.OrdersTable.getRowCount();
            for(int count=rowRemove-1;count>=0;count--){
                tmb.removeRow(count);
            }
        }
    }
}

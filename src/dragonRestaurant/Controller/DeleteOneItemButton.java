package dragonRestaurant.Controller;
import dragonRestaurant.Model.MainGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DeleteOneItemButton {
    public void actionPerformed(){
        DefaultTableModel tmb = (DefaultTableModel) MainGUI.OrdersTable.getModel();
        if(MainGUI.OrdersTable.getSelectedRowCount()==1){
            tmb.removeRow(MainGUI.OrdersTable.getSelectedRow());
        }
        else{
            if(MainGUI.OrdersTable.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "TABLE EMPTY");
            }
            else{
                if(MainGUI.OrdersTable.getSelectedRowCount()>1)
                    JOptionPane.showMessageDialog(null, "Select only ONE row");
                if(MainGUI.OrdersTable.getSelectedRowCount()==0)
                    JOptionPane.showMessageDialog(null, "NONE Selected! Please Select ONE row");
            }
        }
    }   
}

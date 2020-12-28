package dragonRestaurant.Controller;

import dragonRestaurant.Model.MainGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dragonRestaurant.Model.Appetizers;

public class appetizersSelectButton {
    public void actionPerformed(){
     if(Appetizers.AppetizersTable.getRowCount()!=0){
            int[] selected=Appetizers.AppetizersTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]=Appetizers.AppetizersTable.getValueAt(selected[count],0);
                rows[1]=Appetizers.AppetizersTable.getValueAt(selected[count],1);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Appetizers table is Empty!");
        }
    }
}

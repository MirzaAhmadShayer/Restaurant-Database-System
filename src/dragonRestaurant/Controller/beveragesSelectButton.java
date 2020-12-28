
package dragonRestaurant.Controller;

import static dragonRestaurant.Model.Beverages.BeveragesTable;
import dragonRestaurant.Model.MainGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class beveragesSelectButton {
     public void actionPerformed(){
         if(BeveragesTable.getRowCount()!=0){
            int[] selected=BeveragesTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= BeveragesTable.getValueAt(selected[count], 0);
                rows[1]=BeveragesTable.getValueAt(selected[count], 2);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Beverages table is Empty!");
        }
    }
}

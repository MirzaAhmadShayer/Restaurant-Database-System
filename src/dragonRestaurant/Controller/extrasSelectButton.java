
package dragonRestaurant.Controller;

import static dragonRestaurant.Model.Extras.ExtrasTable;
import dragonRestaurant.Model.MainGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class extrasSelectButton {
    public void actionPerformed(){
        if(ExtrasTable.getRowCount()!=0){
            int[] selected=ExtrasTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= ExtrasTable.getValueAt(selected[count], 0);
                rows[1]=ExtrasTable.getValueAt(selected[count], 1);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Extras table is Empty!");
        }
    }
}

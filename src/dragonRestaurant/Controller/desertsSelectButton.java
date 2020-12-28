package dragonRestaurant.Controller;

import static dragonRestaurant.Model.Deserts.DesertsTable;
import dragonRestaurant.Model.MainGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class desertsSelectButton {
    public void actionPerformed(){
         if(DesertsTable.getRowCount()!=0){
            int[] selected=DesertsTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= DesertsTable.getValueAt(selected[count], 0);
                rows[1]=DesertsTable.getValueAt(selected[count], 2);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Deserts table is Empty!");
        }
    }
}

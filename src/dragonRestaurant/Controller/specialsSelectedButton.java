package dragonRestaurant.Controller;

import dragonRestaurant.Model.MainGUI;
import static dragonRestaurant.Model.Specials.SpecialsTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class specialsSelectedButton {
    public void actionPerformed(){
        if(SpecialsTable.getRowCount()!=0){
            int[] selected=SpecialsTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= SpecialsTable.getValueAt(selected[count], 0);
                rows[1]=SpecialsTable.getValueAt(selected[count], 2);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Specials table is Empty!");
        }
    }
}

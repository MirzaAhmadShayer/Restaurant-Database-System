package dragonRestaurant.Controller;

import static dragonRestaurant.Model.MainCourses.MainCoursesTable;
import dragonRestaurant.Model.MainGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mainCoursesSelectButton {
    public void actionPerformed(){
         if(MainCoursesTable.getRowCount()!=0){
            int[] selected=MainCoursesTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= MainCoursesTable.getValueAt(selected[count], 0);
                rows[1]=MainCoursesTable.getValueAt(selected[count], 1);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Main Courses table is Empty!");
        }
    }
}

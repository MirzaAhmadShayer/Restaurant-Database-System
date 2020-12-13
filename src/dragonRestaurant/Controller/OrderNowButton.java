package dragonRestaurant.Controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class OrderNowButton {
    public void ActionPerformed(ActionEvent e){
        double totalPrice=0;
        double dispri;
        //discount
        if(DiscountsButton.discount_digits!=0){
            for(int count=0;count<dragonRestaurant.Model.MainGUI.OrdersTable.getRowCount();count++){
                double amount=Integer.valueOf(dragonRestaurant.Model.MainGUI.OrdersTable.getValueAt(count,1).toString());
                totalPrice+=amount;
            }
            dispri=totalPrice*DiscountsButton.discountCalc;
            totalPrice=(totalPrice-dispri);
            dragonRestaurant.Model.MainGUI.TotalPriceLabel.setText(Double.toString(totalPrice)+" Tk");
            JOptionPane.showMessageDialog(null, "Thank you for ordering!"+"\n"+"Total Price: "+totalPrice+" Tk");
        }
        //no discount
        if(DiscountsButton.discount_digits==0){
             for(int count=0;count<dragonRestaurant.Model.MainGUI.OrdersTable.getRowCount();count++){
                double amount=Integer.valueOf(dragonRestaurant.Model.MainGUI.OrdersTable.getValueAt(count,1).toString());
                totalPrice+=amount;
             }
            dragonRestaurant.Model.MainGUI.TotalPriceLabel.setText(Double.toString(totalPrice)+" Tk");
            
        }
        if(dragonRestaurant.Model.MainGUI.OrdersTable.getRowCount()==0){
            dragonRestaurant.Model.MainGUI.TotalPriceLabel.setText("Nothing Ordered!");
            JOptionPane.showMessageDialog(null, "Can't Order Table Empty");
        } 
    }
}

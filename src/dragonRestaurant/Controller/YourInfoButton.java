package dragonRestaurant.Controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class YourInfoButton {
    String text;
    String CustomerID="18101";
    String Email= "mas123@gmail.com";
    String Address="House-3, Road-2, Block-C, Section-6";
    String phone="01771671623";
    public void ActionPerformed(ActionEvent e){
        this.text=("Customer ID: "+CustomerID+"\n"+"Email: "+Email+"\n"+"Address:"+"\n"+Address+"\n"
                   +"Phone: "+phone);
        JOptionPane.showMessageDialog(null, text);
    }
}

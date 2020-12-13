package dragonRestaurant.Controller;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ContactInfoButton {
    public void ActionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Address:"+"\n"+"House-3,Road-2,Section-6,Block-A"+"\n"
                                      +"Email:"+"\n"+"www.dragonrestaurant.com"+"\n"+"Phone:"+"\n"+"01782567981");
    }
}

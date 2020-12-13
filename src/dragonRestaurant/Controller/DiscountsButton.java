package dragonRestaurant.Controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class DiscountsButton extends OrderNowButton{
    static double  discount_digits = 10;
    static double discountCalc = (discount_digits/100); //10%=10/100=1/10=0.1
    String discount=discount_digits+"%";
    @Override
    public void ActionPerformed(ActionEvent e){
       JOptionPane.showMessageDialog(null, "NOW "+discount+" Discount already given"+"\n"+"Long term customer");
    }
}

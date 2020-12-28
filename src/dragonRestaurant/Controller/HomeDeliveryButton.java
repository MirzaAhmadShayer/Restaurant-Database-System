package dragonRestaurant.Controller;

import javax.swing.JOptionPane;

public class HomeDeliveryButton extends YourInfoButton{  
    public void actionPerformed(){
        if(dragonRestaurant.Model.MainGUI.TotalPriceLabel.getText().equals("Nothing Ordered!"))
          JOptionPane.showMessageDialog(null,"PRESS ORDER NOW BUTTON FIRST!");
        else
          JOptionPane.showMessageDialog(null, "Your Goods will be delivered in 10-minutes to "+"\n"+
                                        "Customer ID: "+this.CustomerID+"\n"+"Address:"+"\n"+this.Address+
                                        "\n"+"Price: "+dragonRestaurant.Model.MainGUI.TotalPriceLabel.getText());
    }
}

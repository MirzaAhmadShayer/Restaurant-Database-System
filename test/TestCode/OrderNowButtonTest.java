package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainGUI;
import dragonRestaurant.Controller.OrderNowButton;

public class OrderNowButtonTest {
    
    MainGUI mgui;
    OrderNowButton onb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        onb = new OrderNowButton();
    }

    @Test
    public void testActionPerformed() {
        onb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

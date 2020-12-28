package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.MainGUI;
import dragonRestaurant.Controller.HomeDeliveryButton;
import org.junit.Before;

public class HomeDeliveryButtonTest {
    
    public HomeDeliveryButtonTest() {
    }
    
    MainGUI mgui;
    HomeDeliveryButton hdb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        hdb = new HomeDeliveryButton();
    }

    @Test
    public void testActionPerformed() {
        hdb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

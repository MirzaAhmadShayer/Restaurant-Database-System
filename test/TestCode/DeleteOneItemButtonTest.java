package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.MainGUI;
import dragonRestaurant.Controller.DeleteOneItemButton;
import org.junit.Before;

public class DeleteOneItemButtonTest {
 
    MainGUI mgui;
    DeleteOneItemButton doib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        doib = new DeleteOneItemButton();
    }

    @Test
    public void testActionPerformed() {
        doib.actionPerformed();
        System.out.println("Test Performed");
    }
    
}

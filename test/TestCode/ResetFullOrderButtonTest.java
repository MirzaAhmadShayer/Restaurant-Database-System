package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainGUI;
import dragonRestaurant.Controller.ResetFullOrderButton;

public class ResetFullOrderButtonTest {
    
    MainGUI mgui;
    ResetFullOrderButton rfob;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        rfob = new ResetFullOrderButton();
    }

    @Test
    public void testActionPerformed() {
        rfob.actionPerformed();
        System.out.println("Test performed");
    }
    
}

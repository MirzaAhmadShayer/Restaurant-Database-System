package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.MainGUI;
import dragonRestaurant.Controller.ExitButton;
import org.junit.Before;

public class ExitButtonTest {
  
    MainGUI mgui;
    ExitButton eb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        eb = new ExitButton();
    }
    
    @Test
    public void testActionPerformed() {
        eb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

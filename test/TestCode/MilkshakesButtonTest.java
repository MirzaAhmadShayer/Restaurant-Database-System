package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
import dragonRestaurant.Controller.MilkshakesButton;

public class MilkshakesButtonTest {
    
    Beverages b;
    MilkshakesButton mb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        mb = new MilkshakesButton();
    }

    @Test
    public void testActionPerformed() {
        mb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

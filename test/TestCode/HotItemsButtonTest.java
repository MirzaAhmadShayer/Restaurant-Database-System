package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
import dragonRestaurant.Controller.HotItemsButton;

public class HotItemsButtonTest {
    
    Beverages b;
    HotItemsButton hib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        hib = new HotItemsButton();
    }

    @Test
    public void testActionPerformed() {
        hib.actionPerformed();
        System.out.println("Test performed");
    }
    
}

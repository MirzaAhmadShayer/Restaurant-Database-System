package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
import dragonRestaurant.Controller.beveragesSelectButton;

public class beveragesSelectButtonTest {
    
    Beverages b;
    beveragesSelectButton bsb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        bsb = new beveragesSelectButton();
    }

    @Test
    public void testActionPerformed() {
        bsb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

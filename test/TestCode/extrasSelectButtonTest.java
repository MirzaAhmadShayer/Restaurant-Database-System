package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Extras;
import dragonRestaurant.Controller.extrasSelectButton;

public class extrasSelectButtonTest {
    
    Extras e;
    extrasSelectButton esb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e = new Extras();
        esb = new extrasSelectButton();
    }

    @Test
    public void testActionPerformed() {
        esb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

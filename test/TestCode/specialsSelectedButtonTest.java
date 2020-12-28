package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Specials;
import dragonRestaurant.Controller.specialsSelectedButton;

public class specialsSelectedButtonTest {
    
    Specials s;
    specialsSelectedButton ssb;
    
    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
        s = new Specials();
        ssb = new specialsSelectedButton();
    }

    @Test
    public void testActionPerformed() {
        ssb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

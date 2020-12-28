package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Deserts;
import dragonRestaurant.Controller.desertsSelectButton;

public class desertsSelectButtonTest {
    
    Deserts d;
    desertsSelectButton dsb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        d = new Deserts();
        dsb = new desertsSelectButton();
    }

    @Test
    public void testActionPerformed() {
        dsb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

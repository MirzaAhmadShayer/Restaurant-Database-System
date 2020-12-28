package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Appetizers;
import dragonRestaurant.Controller.appetizersSelectButton;

public class appetizersSelectButtonTest {
    
    Appetizers a;
    appetizersSelectButton asb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        a = new Appetizers();
        asb = new appetizersSelectButton();
    }

    @Test
    public void testActionPerformed() {
        asb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Controller.YourInfoButton;

public class YourInfoButtonTest {
    
    YourInfoButton yib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        yib = new YourInfoButton();
    }

    @Test
    public void testActionPerformed() {
        yib.actionPerformed();
        System.out.println("Test Performed");
    }
    
}

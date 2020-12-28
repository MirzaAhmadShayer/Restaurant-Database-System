package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Extras;
import dragonRestaurant.Controller.SaucesButton;

public class SaucesButtonTest {
    
    Extras e;
    SaucesButton sb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e = new Extras();
        sb = new SaucesButton();
    }

    @Test
    public void testActionPerformed() {
        sb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Extras;
import dragonRestaurant.Controller.CheeseButton;

public class CheeseButtonTest {

    Extras e;
    CheeseButton cb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e = new Extras();
        cb = new CheeseButton();
    }

    @Test
    public void testActionPerformed() {
        cb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

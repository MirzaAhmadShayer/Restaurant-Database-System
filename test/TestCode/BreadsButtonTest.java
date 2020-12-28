package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.Extras;
import dragonRestaurant.Controller.BreadsButton;
import org.junit.Before;

public class BreadsButtonTest {
   
    Extras e;
    BreadsButton bb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e= new Extras();
        bb= new BreadsButton();
    }

    @Test
    public void testActionPerformed() {
        bb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

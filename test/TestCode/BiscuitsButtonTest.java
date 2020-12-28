package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.Extras;
import dragonRestaurant.Controller.BiscuitsButton;
import org.junit.Before;

public class BiscuitsButtonTest {
    
     Extras e;
     BiscuitsButton bb;
     
    @Before
    public void setUp() throws Exception{
       System.out.println("Set up");
       e = new Extras();
       bb = new BiscuitsButton();
    }

    @Test
    public void testActionPerformed() {
        bb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

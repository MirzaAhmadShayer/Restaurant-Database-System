package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Specials;
import dragonRestaurant.Controller.SpecialsButton;

public class SpecialsButtonTest {
    
    Specials s;
    SpecialsButton sb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        s = new Specials();
        sb = new SpecialsButton();
    }

    @Test
    public void testActionPerformed() {
        sb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

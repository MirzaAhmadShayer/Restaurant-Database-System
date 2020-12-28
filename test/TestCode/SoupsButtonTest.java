package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Appetizers;
import dragonRestaurant.Controller.SoupsButton;

public class SoupsButtonTest {
    
    Appetizers a;
    SoupsButton sb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        a = new Appetizers();
        sb = new SoupsButton();
    }

    @Test
    public void testActionPerformed() {
        sb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

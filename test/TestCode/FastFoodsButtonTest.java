package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Appetizers;
import dragonRestaurant.Controller.FastFoodsButton;

public class FastFoodsButtonTest {
    
    Appetizers a;
    FastFoodsButton ffb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        a = new Appetizers();
        ffb = new FastFoodsButton();
    }

    @Test
    public void testActionPerformed() {
        ffb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

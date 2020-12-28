package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
import dragonRestaurant.Controller.FruitJuicesButton;

public class FruitJuicesButtonTest {
    
    Beverages b;
    FruitJuicesButton fjb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        fjb = new FruitJuicesButton();
    }

    @Test
    public void testActionPerformed() {
        fjb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

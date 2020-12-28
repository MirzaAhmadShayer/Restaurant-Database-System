package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
import dragonRestaurant.Controller.SoftDrinksButton;

public class SoftDrinksButtonTest {
    
    Beverages b;
    SoftDrinksButton sdb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        sdb = new SoftDrinksButton();
    }

    @Test
    public void testActionPerformed(){
        sdb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

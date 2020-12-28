package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Controller.DiscountsButton;

public class DiscountsButtonTest {
   
    DiscountsButton db;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        db = new DiscountsButton();
    }

    @Test
    public void testActionPerformed() {
        db.actionPerformed();
        System.out.println("Test performed");
    }
    
}

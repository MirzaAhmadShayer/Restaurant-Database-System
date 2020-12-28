package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Deserts;
import dragonRestaurant.Controller.DesertsComboBox;

public class DesertsComboBoxTest {

    Deserts d;
    DesertsComboBox dcb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        d = new Deserts();
        dcb = new DesertsComboBox();
    }

    @Test
    public void testActionPerformed() {
        dcb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

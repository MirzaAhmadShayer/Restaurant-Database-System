package TestCode;

import dragonRestaurant.Controller.ContactInfoButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ContactInfoButtonTest {
 
    ContactInfoButton cib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        cib = new ContactInfoButton();
    }

    @Test
    public void testActionPerformed() {
        cib.ActionPerformed();
        System.out.println("Test performed");
    }
    
}

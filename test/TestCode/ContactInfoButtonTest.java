/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.ContactInfoButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author SN PC
 */
public class ContactInfoButtonTest {
 
    ContactInfoButton cib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        cib = new ContactInfoButton();
    }
    /**
     * Test of ActionPerformed method, of class ContactInfoButton.
     */
    @Test
    public void testActionPerformed() {
        cib.ActionPerformed();
        System.out.println("Test performed");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.YourInfoButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author SN PC
 */
public class YourInfoButtonTest {
    
    YourInfoButton yib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        yib = new YourInfoButton();
    }
    /**
     * Test of actionPerformed method, of class YourInfoButton.
     */
    @Test
    public void testActionPerformed() {
        yib.actionPerformed();
        System.out.println("Test Performed");
    }
    
}

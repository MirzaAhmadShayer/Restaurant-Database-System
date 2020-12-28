/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.beveragesSelectButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;

/**
 *
 * @author SN PC
 */
public class beveragesSelectButtonTest {
    
    Beverages b;
    beveragesSelectButton bsb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        bsb = new beveragesSelectButton();
    }

    /**
     * Test of actionPerformed method, of class beveragesSelectButton.
     */
    @Test
    public void testActionPerformed() {
        bsb.actionPerformed();
        System.out.println("Test performed");
    }
    
}

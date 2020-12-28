/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.HotItemsButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;

/**
 *
 * @author SN PC
 */
public class HotItemsButtonTest {
    
    Beverages b;
    HotItemsButton hib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        hib = new HotItemsButton();
    }

    /**
     * Test of actionPerformed method, of class HotItemsButton.
     */
    @Test
    public void testActionPerformed() {
        hib.actionPerformed();
        System.out.println("Test performed");
    }
    
}

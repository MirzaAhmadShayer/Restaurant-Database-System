/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.MilkshakesButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
/**
 *
 * @author SN PC
 */
public class MilkshakesButtonTest {
    
    Beverages b;
    MilkshakesButton mb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        mb = new MilkshakesButton();
    }

    /**
     * Test of actionPerformed method, of class MilkshakesButton.
     */
    @Test
    public void testActionPerformed() {
        mb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
